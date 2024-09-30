import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main extends JFrame {
    private BufferedImage imagem;
    private JLabel labelImagem;
    private FloodFill floodFill;
    private Color novaCor = Color.RED; // Cor para o preenchimento
    private Timer timer;
    private int pixelsPorSegundo = 1000; // Definindo a quantidade de pixels a serem preenchidos por segundo

    public Main() throws IOException {
        // Carregar a imagem inicial
        imagem = ImageIO.read(new File("images/inicial.png"));
        floodFill = new FloodFill(imagem);
        floodFill.iniciaPreenchimento(10, 10, novaCor); // Inicia o preenchimento

        // Configuração da interface
        setTitle("Flood Fill Animation");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelImagem = new JLabel(new ImageIcon(imagem));
        add(labelImagem);
        setVisible(true);

        // Timer para animação
        timer = new Timer(1000 / pixelsPorSegundo, new ActionListener() { // 1000 ms / 1000 = 1 ms
            @Override
            public void actionPerformed(ActionEvent e) {
                // Tenta preencher até 1000 pixels por segundo
                for (int i = 0; i < pixelsPorSegundo; i++) {
                    if (!floodFill.preencheProximoPixel(novaCor)) {
                        timer.stop(); // Para o timer se não houver mais pixels
                        break;
                    }
                }
                labelImagem.setIcon(new ImageIcon(imagem)); // Atualiza a imagem na interface
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        try {
            new Main();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
