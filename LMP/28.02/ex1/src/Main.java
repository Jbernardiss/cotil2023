public class Main {
    public static void main(String[] args) {
        Employee em1 = new Employee("Matheus", "Guilherme", 100.0);
        Employee em2 = new Employee();
        em2.setName("João");
        em2.setSurname("Bernardis");
        em2.setMonthlyWage(-1);

        em1.setMonthlyWage(em1.getMonthlyWage());
        em2.setMonthlyWage(em2.getMonthlyWage());
        System.out.println("Name: " + em1.getName() + "\nSurname: " + em1.getSurname() + "\nMonthly wage: USS " + em1.getMonthlyWage() + "\nYearly: " + em1.getYearlyWage());
        System.out.println("Name: " + em2.getName() + "\nSurname: " + em2.getSurname() + "\nMonthly wage: USS " + em2.getMonthlyWage() + "\nYearly: " + em2.getYearlyWage());

        em1.setMonthlyWage(em1.getMonthlyWage() * 1.1);
        em2.setMonthlyWage(em2.getMonthlyWage() * 1.1);

        System.out.println("Name: " + em1.getName() + "\nSurname: " + em1.getSurname() + "\nMonthly wage: USS " + String.format("%.02f", em1.getMonthlyWage()) + "\nYearly: " + String.format("%.02f", em1.getYearlyWage()));
        System.out.println();
        System.out.println("Name: " + em2.getName() + "\nSurname: " + em2.getSurname() + "\nMonthly wage: USS " + String.format("%.02f", em2.getMonthlyWage()) + "\nYearly: " + String.format("%.02f", em2.getYearlyWage()));
    }
}