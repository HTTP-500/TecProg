import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Usuario {
    private String tema;
    private boolean notificacoes;
    private int volume;

    public void setPreferencias(String tema, boolean notificacoes, int volume) {
        this.tema = tema;
        this.notificacoes = notificacoes;
        this.volume = volume;
    }

    public String getPreferencias() {
        return String.format("Tema: %s, Notificações: %s, Volume: %d", 
                             tema, notificacoes ? "Habilitadas" : "Desabilitadas", volume);
    }
}

public class PreferenciasUsuario extends JFrame {
    private Usuario usuario;
    private JTextArea preferenciasArea;

    public PreferenciasUsuario() {
        usuario = new Usuario();
        setTitle("Configuração de Preferências");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        JLabel temaLabel = new JLabel("Tema:");
        JComboBox<String> temaComboBox = new JComboBox<>(new String[]{"Claro", "Escuro"});
        JLabel notificacoesLabel = new JLabel("Notificações:");
        JCheckBox notificacoesCheckBox = new JCheckBox();
        JLabel volumeLabel = new JLabel("Volume:");
        JSlider volumeSlider = new JSlider(0, 100, 50);
        JButton salvarButton = new JButton("Salvar");
        preferenciasArea = new JTextArea();
        preferenciasArea.setEditable(false);

        temaComboBox.addActionListener(e -> {
            if (temaComboBox.getSelectedItem().equals("Escuro")) {
                getContentPane().setBackground(Color.DARK_GRAY);
            } else {
                getContentPane().setBackground(Color.LIGHT_GRAY);
            }
        });

        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tema = (String) temaComboBox.getSelectedItem();
                boolean notificacoes = notificacoesCheckBox.isSelected();
                int volume = volumeSlider.getValue();
                usuario.setPreferencias(tema, notificacoes, volume);
                preferenciasArea.setText(usuario.getPreferencias());
            }
        });

        add(temaLabel);
        add(temaComboBox);
        add(notificacoesLabel);
        add(notificacoesCheckBox);
        add(volumeLabel);
        add(volumeSlider);
        add(salvarButton);
        add(preferenciasArea);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PreferenciasUsuario preferencias = new PreferenciasUsuario();
            preferencias.setVisible(true);
        });
    }
}
