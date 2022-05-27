package ProjetoIntegrador;

import java.util.Locale;

public class TestesComStrings {

    public static void main(String[] args) {

        //Tamanho total de cada linha: 1200 caracteres
        String headerGeralDoArquivo = "000000000004 BANCO FAKERALL S.A 20220223                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ";
        String headerLote = "10010000010001GOLD MASTERCARD     01010605000201010005                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ";
        String detalhe = "20010000010000010000718294                              1426                                    02/22                                   CLARA RIBEIRO                           746                                     B2231236880519753^RIBEIRO/CLARA             ^2702206000000000000995000000     2231236880519753=27022060000099500000                                                                                                             *1CLARA RIBEIRO             RUA BELA VISTA                                    CENTRO              NOVO HAMBURGO       RS93320340                                                                                                                                                                                                                                                                       001                           0000002000000530000000100                B2231236880519753^RIBEIRO/CLARA             ^2702206000000000000287000000     2231236880519753=27022060000028700000              000000000011                                                                                                                 757                                         ";
        String traillerLote = "30010000010000001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ";
        String traillerGeral = "90000001                                                                                                                                                                          ";

        //Não sei se copiei errado o arquivo mas a linha 5 (traillerGeral) não está batendo os 1200 caracteres como pede no manual

        //Verificando o tamanho total de cada linha do texto
        System.out.println(headerGeralDoArquivo.length());
        System.out.println(headerLote.length());
        System.out.println(detalhe.length());
        System.out.println(traillerLote.length());
        System.out.println(traillerGeral.length());

        //Iniciando separação de cada linha em Header Geral do Arquivo:

        //Observação: ao especificar o "index" abaixo, se atentar ao arquivo manual, pois lá tá se referindo à posição do caracter começando com 1
        //O primeiro index será um a menos que o manual e o segundo será igual ao manual

        String tipRegHgHeaderGeralDoArquivo = headerGeralDoArquivo.substring(0,1);
        String bancoHeaderGeralDoArquivo = headerGeralDoArquivo.substring(1,5);
        String nspHeaderGeralDoArquivo = headerGeralDoArquivo.substring(5,12);
        String sistOrigHeaderGeralDoArquivo = headerGeralDoArquivo.substring(12,32);
        String dtMovtoHeaderGeralDoArquivo = headerGeralDoArquivo.substring(32,40);
        String fillerHeaderGeralDoArquivo = headerGeralDoArquivo.substring(40,1200);

        //Iniciando separação da linha 2 Header Lote:

        String tipRegHeaderLote = headerLote.substring(0,1);
        String modeloDoPlasticoHeaderLote = headerLote.substring(1,4);
        String numeroDoKitHeaderLote = headerLote.substring(4,10);
        String seqDoLoteHeaderLote = headerLote.substring(10,14);
        String nomeDoPlasticoHeaderLote = headerLote.substring(14,34);
        String tipoProcessamentoHeaderLote = headerLote.substring(34,36);
        String tipoMovimentoHeaderLote = headerLote.substring(36,38);
        String tipoDoCartaoHeaderLote = headerLote.substring(38,40);
        String tipoDeGravacaoHeaderLote = headerLote.substring(40,42);
        String corDeEntintamentoHeaderLote = headerLote.substring(42,44);
        String tipoDeEnvelopamentoHeaderLote = headerLote.substring(44,46);
        String tipoDeEnderecamentoHeaderLote = headerLote.substring(46,48);
        String etiquetaDeBloqueioHeaderLote = headerLote.substring(48,50);
        String overlayHeaderLote = headerLote.substring(50,52);
        String postagemHeaderLote = headerLote.substring(52,54);
        String fillerHeaderLote = headerLote.substring(54,1200);

        
    }

}
