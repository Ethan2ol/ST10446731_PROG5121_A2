import javax.swing.JOptionPane;

public class TaskFeature {
    public static int totalHours = 0;

    public static void main(String[] args) {
        taskFeature();
    }
// Creating the Menu
    public static void taskFeature() {
        int option;
        do {
            option = showOptionDialog();
            switch (option) {
                case 0 -> addTasks();
                case 1 -> showMessageDialog("Coming Soon");
                case 2 -> showMessageDialog("Exiting Program");
            }
        } while (option != 2);
    }

    public static int showOptionDialog() {
        String[] options = { "1. Add Tasks", "2. Show Report", "3. Quit" };
        return JOptionPane.showOptionDialog(
                null, "Select an option:", "Welcome To EasyKanban", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
    }
// Amount of tasks the user wants
    public static void addTasks() {
        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks would you like to add?"));

        for (int i = 1; i <= numTasks; i++) {
            Task task = new Task();
//Task Name
            String taskName = JOptionPane.showInputDialog("Please enter the Task Name:");
            task.setTaskName(taskName);

            int taskNumber = (int)(Math.random()* 1000);
            String formattedNumber = String.format("%04d", taskNumber);
            task.setTaskNumber(taskNumber);

            // The Description of the Task

            String taskDescription = JOptionPane.showInputDialog("Please enter the Task Description (max 50 characters):");
            while (!task.checkTaskDescription(taskDescription)) {
                taskDescription = showInputDialog("Please enter a task description of less than 50 characters:");
            }
            task.setTaskDescription(taskDescription);

            //User's first and last name
            String developerDetails = JOptionPane.showInputDialog("Please enter Developer Details (First and Last Name):");
            task.setDeveloperDetails(developerDetails);

            //Duration of the Task

            int taskHours = Integer.parseInt(JOptionPane.showInputDialog("How many hours will the task take?"));
            task.setTaskHours(taskHours);
            TaskFeature.totalHours += taskHours;

            //Task's status

            String taskStatus = JOptionPane.showInputDialog("Task Status (please type out one of these options):\n1. To Do\n2. Doing\n3. Done");
            task.setTaskStatus(taskStatus);

            //UserID
            String taskID = task.createTaskID();
            task.setTaskID(taskID);

            showMessageDialog(task.printTaskDetails());
        }
    }

    public static String showInputDialog(String message) {
        return JOptionPane.showInputDialog(null, message);
    }

    public static void showMessageDialog(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static int returnTotalHours() {
        return totalHours;
    }
}

class Task {
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private int taskHours;
    private String taskStatus;
    private String taskID;

    //Boolean
    public boolean checkTaskDescription(String description) {
        if (description.length() > 50) {
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
            return false;
        } else {
            JOptionPane.showMessageDialog(null, "Task successfully captured.");
            return true;
        }
    }

    public String createTaskID() {
        String initials = taskName.substring(0, 2).toUpperCase();
        String lastThreeChar = developerDetails.substring(developerDetails.length() - 3).toUpperCase();
        return initials + ":" +taskNumber + ":" + lastThreeChar;
    }

    //Details

    public String printTaskDetails() {
        String details = "Task Status: " + taskStatus + "\n";
        details += "Developer Details: " + developerDetails + "\n";
        details += "Task Number: " + taskNumber + "\n";
        details += "Task Name: " + taskName + "\n";
        details += "Task Description: " + taskDescription + "\n";
        details += "Task ID: " + taskID + "\n";
        details += "Task Hours: " + taskHours + "\n";
        details += "Total Hours:" + TaskFeature.totalHours + "\n";
        return details;
    }

    public String TaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskNumber(int taskNumber){
        this.taskNumber=taskNumber;
    }

    public String TaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String DeveloperDetails() {
        return developerDetails;
    }

    public void setDeveloperDetails(String developerDetails) {
        this.developerDetails = developerDetails;
    }

    public int getTaskHours() {
        return taskHours;
    }

    public void setTaskHours(int taskHours) {
        this.taskHours = taskHours;
    }

    public String TaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID){
    this.taskID = taskID;
    }
}











