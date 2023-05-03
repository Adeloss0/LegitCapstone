public class HomesScreen {
    public static void main(String[] args) {
        System.out.println("Welcome to Accounting Ledger Application");

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Please select an option:");
            System.out.println("  D) Add Deposit");
            System.out.println("  P) Make Payment (Debit)");
            System.out.println("  L) Ledger");
            System.out.println("  R) Reports");
            System.out.println("  X) Exit");

            String input = scanner.nextLine();
            switch (input.toUpperCase()) {
                case "D":
                    addDeposit();
                    break;
                case "P":
                    addPayment();
                    break;
                case "L":
                    showLedger();
                    break;
                case "R":
                    showReports();
                    break;
                case "X":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option selected. Please try again.");
            }


        }


    }