public class PercentualFaturamento {

    public static void main(String[] args) {
        // Valores de faturamento por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        // Calcula o faturamento total
        double total = sp + rj + mg + es + outros;

        // Calcula o percentual de cada estado
        double percentualSp = (sp / total) * 100;
        double percentualRj = (rj / total) * 100;
        double percentualMg = (mg / total) * 100;
        double percentualEs = (es / total) * 100;
        double percentualOutros = (outros / total) * 100;

        // Exibe os resultados
        System.out.printf("Percentual de SP: %.2f%%\n", percentualSp);
        System.out.printf("Percentual de RJ: %.2f%%\n", percentualRj);
        System.out.printf("Percentual de MG: %.2f%%\n", percentualMg);
        System.out.printf("Percentual de ES: %.2f%%\n", percentualEs);
        System.out.printf("Percentual de Outros: %.2f%%\n", percentualOutros);
    }
}
