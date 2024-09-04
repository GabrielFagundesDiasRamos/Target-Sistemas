public class FaturamentoDistribuidora {

    public static void main(String[] args) {
        // Vetor com os valores de faturamento diário
        double[] faturamentoDiario = {
            31490.7866, 37277.9400, 37708.4303, 0.0000, 0.0000,
            17934.2269, 0.0000, 6965.1262, 24390.9374, 14279.6481,
            0.0000, 0.0000, 39807.6622, 27261.6304, 39775.6434,
            29797.6232, 17216.5017, 0.0000, 0.0000, 12974.2000,
            28490.9861, 8748.0937, 8889.0023, 17767.5583, 0.0000,
            0.0000, 3071.3283, 48275.2994, 10299.6761, 39874.1073
        };

        // Calcula o menor e o maior valor de faturamento
        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        double soma = 0;
        int diasComFaturamentoSuperiorAMedia = 0;

        for (double valor : faturamentoDiario) {
            if (valor > 0) {
                if (valor < menorValor) {
                    menorValor = valor;
                }
                if (valor > maiorValor) {
                    maiorValor = valor;
                }
                soma += valor;
            }
        }

        // Calcula a média mensal
        double mediaMensal = soma / faturamentoDiario.length;

        // Conta os dias com faturamento superior à média mensal
        for (double valor : faturamentoDiario) {
            if (valor > mediaMensal) {
                diasComFaturamentoSuperiorAMedia++;
            }
        }

        // Exibe os resultados
        System.out.println("Menor valor de faturamento ocorrido em um dia do mês: " + menorValor);
        System.out.println("Maior valor de faturamento ocorrido em um dia do mês: " + maiorValor);
        System.out.println("Número de dias no mês em que o faturamento diário foi superior à média mensal: " + diasComFaturamentoSuperiorAMedia);
    }
}
