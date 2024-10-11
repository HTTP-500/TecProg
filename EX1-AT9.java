import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroForm extends JFrame {
    private JTextField nomeField;
    private JSpinner idadeSpinner;
    private JRadioButton masculinoButton;
    private JRadioButton femininoButton;
    private JLabel resultadoLabel;

    public CadastroForm() {
        setTitle("Cadastro de Cliente");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();

        JLabel idadeLabel = new JLabel("Idade:");
        idadeSpinner = new JSpinner(new SpinnerNumberModel(18, 0, 120, 1));

        JLabel sexoLabel = new JLabel("Sexo:");
        masculinoButton = new JRadioButton("Masculino");
        femininoButton = new JRadioButton("Feminino");
        ButtonGroup sexoGroup = new ButtonGroup();
        sexoGroup.add(masculinoButton);
        sexoGroup.add(femininoButton);

        JButton enviarButton = new JButton("Enviar");
        resultadoLabel = new JLabel("");

        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enviarDados();
            }
        });

        add(nomeLabel);
        add(nomeField);
        add(idadeLabel);
        add(idadeSpinner);
        add(sexoLabel);
        add(masculinoButton);
        add(new JLabel());  // Espaço vazio
        add(femininoButton);
        add(enviarButton);
        add(resultadoLabel);
    }

    private void enviarDados() {
        String nome = nomeField.getText();
        int idade = (Integer) idadeSpinner.getValue();
        String sexo = masculinoButton.isSelected() ? "Masculino" : "Feminino";

        if (nome.isEmpty() || sexo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
            return;
        }

        String resultado = String.format("Nome: %s, Idade: %d, Sexo: %s", nome, idade, sexo);
        resultadoLabel.setText(resultado);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CadastroForm form = new CadastroForm();
            form.setVisible(true);
        });
    }
}
