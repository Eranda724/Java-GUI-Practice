import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private JButton startButton;
    private JTextArea textArea;

    public Main() {
        setTitle("Java GUI with Threads Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize components
        startButton = new JButton("Start Task");
        textArea = new JTextArea();
        textArea.setEditable(false);

        // Add components to the frame
        setLayout(new BorderLayout());
        add(startButton, BorderLayout.NORTH);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Add button action listener
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startBackgroundTask();
            }
        });
    }

    private void startBackgroundTask() {
        // Disable the button to prevent multiple starts
        startButton.setEnabled(false);

        // Create and start the background task
        new BackgroundTask().execute();
    }

    private class BackgroundTask extends SwingWorker<Void, String> {

        @Override
        protected Void doInBackground() throws Exception {
            for (int i = 1; i <= 10; i++) {
                // Simulate a long-running task
                Thread.sleep(1000);

                // Publish interim results
                publish("Task running... " + i + "/10\n");
            }
            return null;
        }

        @Override
        protected void process(java.util.List<String> chunks) {
            // Update the text area with the interim results
            for (String chunk : chunks) {
                textArea.append(chunk);
            }
        }

        @Override
        protected void done() {
            // Re-enable the button when the task is done
            startButton.setEnabled(true);
            textArea.append("Task completed!\n");
        }
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}
