import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class FloodFill extends JPanel {
    private BufferedImage image;
    private int targetColor;
    private int replacementColor;
    private boolean[][] visited;  // Marca os pixels já visitados
    private int pixelsPerSecond = 5000; // Velocidade de preenchimento (1000 pixels por segundo)

    public FloodFill(String imagePath) throws IOException {
        this.image = ImageIO.read(new File(imagePath));
        this.visited = new boolean[image.getWidth()][image.getHeight()];
    }

    public void fillUsingStack(int x, int y, Color replacementColor) throws InterruptedException {
        this.targetColor = image.getRGB(x, y);
        this.replacementColor = replacementColor.getRGB();
        
        DynamicStack<int[]> stack = new DynamicStack<>();
        stack.push(new int[]{x, y});
        int pixelCount = 0;

        while (!stack.isEmpty()) {
            int[] point = stack.pop();
            int px = point[0];
            int py = point[1];
            
            if (isValid(px, py)) {
                image.setRGB(px, py, this.replacementColor);
                visited[px][py] = true;  // Marca o pixel como visitado
                repaint(); // Atualiza a interface gráfica
                
                pixelCount++;
                if (pixelCount % pixelsPerSecond == 0) {
                    Thread.sleep(100); // Espera 1 segundo após processar 1000 pixels
                }
                
                stack.push(new int[]{px + 1, py});
                stack.push(new int[]{px - 1, py});
                stack.push(new int[]{px, py + 1});
                stack.push(new int[]{px, py - 1});
            }
        }
    }

    public void fillUsingQueue(int x, int y, Color replacementColor) throws InterruptedException {
        this.targetColor = image.getRGB(x, y);
        this.replacementColor = replacementColor.getRGB();
        
        DynamicQueue<int[]> queue = new DynamicQueue<>();
        queue.add(new int[]{x, y});
        int pixelCount = 0;

        while (!queue.isEmpty()) {
            int[] point = queue.remove();
            int px = point[0];
            int py = point[1];
            
            if (isValid(px, py)) {
                image.setRGB(px, py, this.replacementColor);
                visited[px][py] = true;  // Marca o pixel como visitado
                repaint(); // Atualiza a interface gráfica
                
                pixelCount++;
                if (pixelCount % pixelsPerSecond == 0) {
                    Thread.sleep(100); // Espera 1 segundo após processar 1000 pixels
                }
                
                queue.add(new int[]{px + 1, py});
                queue.add(new int[]{px - 1, py});
                queue.add(new int[]{px, py + 1});
                queue.add(new int[]{px, py - 1});
            }
        }
    }

    private boolean isValid(int x, int y) {
        return x >= 0 && x < image.getWidth() && y >= 0 && y < image.getHeight() && !visited[x][y] && image.getRGB(x, y) == this.targetColor;
    }

    public void saveImage(String outputPath) throws IOException {
        ImageIO.write(this.image, "png", new File(outputPath));
    }

    // Método para desenhar a imagem na interface gráfica
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }

    // Método para obter as dimensões da imagem
    @Override
    public java.awt.Dimension getPreferredSize() {
        return new java.awt.Dimension(image.getWidth(), image.getHeight());
    }
}
