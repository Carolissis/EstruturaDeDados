import java.awt.Color;
import java.io.IOException;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        try {
            // Caminho da imagem
            String inputImagePath = "images/inicial.png";
            String outputImagePathStack = "images/resultado_stack.png";
            
            // Inicializa o JFrame para mostrar a imagem em tempo real
            JFrame frame = new JFrame("Flood Fill");
            FloodFill floodFill = new FloodFill(inputImagePath);
            frame.add(floodFill);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
            // Coordenadas de exemplo e cor de preenchimento
            int startX = 230; // Coordenada X de início
            int startY = 350; // Coordenada Y de início
            Color fillColor = Color.MAGENTA; // Cor de preenchimento
            
            // Executa o preenchimento utilizando a Pilha (visualizado em tempo real)
            floodFill.fillUsingStack(startX, startY, fillColor);
            floodFill.saveImage(outputImagePathStack);
            // Você pode alternar para o uso da fila se quiser
            // floodFill.fillUsingQueue(startX, startY, fillColor);
            // floodFill.saveImage(outputImagePathQueue);
            
            System.out.println("Preenchimento concluído. Verifique os arquivos de saída.");
            
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        try {
            // Caminho da imagem
            String inputImagePath = "images/inicial.png";
            String outputImagePathQueue = "images/resultado_queue.png";
            
            // Inicializa o JFrame para mostrar a imagem em tempo real
            JFrame frame = new JFrame("Flood Fill");
            FloodFill floodFill = new FloodFill(inputImagePath);
            frame.add(floodFill);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
            // Coordenadas de exemplo e cor de preenchimento
            int startX = 230; // Coordenada X de início
            int startY = 350; // Coordenada Y de início
            Color fillColor = Color.PINK; // Cor de preenchimento
            floodFill.fillUsingQueue(startX, startY, fillColor);
            floodFill.saveImage(outputImagePathQueue);
            
            // Você pode alternar para o uso da fila se quiser
            // floodFill.fillUsingQueue(startX, startY, fillColor);
            // floodFill.saveImage(outputImagePathQueue);
            
            System.out.println("Preenchimento concluído. Verifique os arquivos de saída.");
            
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
