public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(29, 2, 2020);
        Date date2 = new Date(31, 12, 2020);
        Date date3 = new Date(28, 2, 2021);

        // Teste para incrementar para o próximo dia
        System.out.println("Teste para incrementar para o próximo dia:");
        for (int i = 0; i < 5; i++) {
            date1.displayDate();
            date1.nextDay();
        }

        // Teste para incrementar para o próximo mês
        System.out.println("\nTeste para incrementar para o próximo mês:");
        for (int i = 0; i < 5; i++) {
            date2.displayDate();
            date2.nextDay();
        }

        // Teste para incrementar para o próximo ano
        System.out.println("\nTeste para incrementar para o próximo ano:");
        for (int i = 0; i < 5; i++) {
            date3.displayDate();
            date3.nextDay();
        }
    }
}