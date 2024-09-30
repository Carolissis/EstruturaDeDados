import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.LinkedList;

public class FloodFill {
    private BufferedImage image;
    private LinkedList<Pixel> pixelsParaPreencher;
    private Color corOriginal;

    public FloodFill(BufferedImage image) {
        this.image = image;
        this.pixelsParaPreencher = new LinkedList<>();
    }

    public void iniciaPreenchimento(int x, int y, Color novaCor) {
        corOriginal = new Color(image.getRGB(x, y));
        if (corOriginal.equals(novaCor)) return;

        pixelsParaPreencher.add(new Pixel(x, y));
    }

    public boolean preencheProximoPixel(Color novaCor) {
        if (pixelsParaPreencher.isEmpty()) {
            return false; // Não há mais pixels para preencher
        }
        Pixel p = pixelsParaPreencher.poll(); // Pega e remove o próximo pixel
        if (p != null) {
            if (p.x < 0 || p.x >= image.getWidth() || p.y < 0 || p.y >= image.getHeight()) return true;
            if (!new Color(image.getRGB(p.x, p.y)).equals(corOriginal)) return true;

            image.setRGB(p.x, p.y, novaCor.getRGB());

            // Adiciona os vizinhos
            pixelsParaPreencher.add(new Pixel(p.x + 1, p.y));
            pixelsParaPreencher.add(new Pixel(p.x - 1, p.y));
            pixelsParaPreencher.add(new Pixel(p.x, p.y + 1));
            pixelsParaPreencher.add(new Pixel(p.x, p.y - 1));
            return true; // Preenchimento foi realizado
        }
        return false;
    }

    public BufferedImage getImagem() {
        return image;
    }
}
