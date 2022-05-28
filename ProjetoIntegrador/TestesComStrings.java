package ProjetoIntegrador;

import java.util.Locale;

public class TestesComStrings {

    public static void main(String[] args) {

        //Anotações importantes:
        //Criar métodos para simplificar as operações abaixo

        //Tamanho total de cada linha: 1200 caracteres
        String headerGeralDoArquivo = "000000000004 BANCO FAKERALL S.A 20220223                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ";
        String headerLote = "10010000010001GOLD MASTERCARD     01010605000201010005                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ";
        String detalhe = "20010000010000010000718294                              1426                                    02/22                                   CLARA RIBEIRO                           746                                     B2231236880519753^RIBEIRO/CLARA             ^2702206000000000000995000000     2231236880519753=27022060000099500000                                                                                                             *1CLARA RIBEIRO             RUA BELA VISTA                                    CENTRO              NOVO HAMBURGO       RS93320340                                                                                                                                                                                                                                                                       001                           0000002000000530000000100                B2231236880519753^RIBEIRO/CLARA             ^2702206000000000000287000000     2231236880519753=27022060000028700000              000000000011                                                                                                                 757                                         ";
        String traillerLote = "30010000010000001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ";
        String traillerGeral = "90000001                                                                                                                                                                          ";

        //Não sei se copiei errado o arquivo mas a linha 5 (traillerGeral) não está batendo os 1200 caracteres como pede no manual

        //Verificando o tamanho total de cada linha do texto
        System.out.println("length da linha 1 Header Geral do Arquivo: " + headerGeralDoArquivo.length());
        System.out.println("length da linha 2 Header Lote: " +headerLote.length());
        System.out.println("length da linha 3 Detalhe: " +detalhe.length());
        System.out.println("length da linha 4 Trailler Lote: " +traillerLote.length());
        System.out.println("length da linha 5 Trailler Geral: " +traillerGeral.length());

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

        //Iniciando separação da linha 3 Detalhe:

        String tipRegDetalhe = detalhe.substring(0,1);
        String modPlastDetalhe = detalhe.substring(1,4);
        String kitDetalhe = detalhe.substring(4,10);
        String seqCartDetalhe = detalhe.substring(10,16);
        String linha01Detalhe = detalhe.substring(16,56);
        String linha02Detalhe = detalhe.substring(56,96);
        String linha03Detalhe = detalhe.substring(96,136);
        String linha04Detalhe = detalhe.substring(136,176);
        String linhaVersoDetalhe = detalhe.substring(176,216);
        String trilha01Detalhe = detalhe.substring(216,294);
        String trilha02Detalhe = detalhe.substring(294,333);
        String trilha03Detalhe = detalhe.substring(333,440);
        String qtdCartoesDetalhe = detalhe.substring(440,442);
        String nomeDetalhe = detalhe.substring(442,468);
        String dadosEnderecoDetalhe = detalhe.substring(468, 518);
        String bairroDetalhe = detalhe.substring(518,538);
        String cidadeDetalhe = detalhe.substring(538,558);
        String ufDetalhe = detalhe.substring(558,560);
        String cepDetalhe = detalhe.substring(560,568);
        String nroArDetalhe = detalhe.substring(568,577);
        String cepArDetalhe = detalhe.substring(577,581);
        String codRegionalDetalhe = detalhe.substring(581,584);
        String codAgenciaDetalhe = detalhe.substring(584,588);
        String nmAbrAgeDetalhe = detalhe.substring(588,603);
        String tpUorPabDetalhe = detalhe.substring(603,606);
        String codUorPabDetalhe = detalhe.substring(606,610);
        String nmAbrPabDetalhe = detalhe.substring(610,625);
        String folderDetalhe = detalhe.substring(625,634);
        String codPabDetalhe = detalhe.substring(634,636);
        String nomeAdicionalDetalhe = detalhe.substring(636,681);
        String enderecoAgeDetalhe = detalhe.substring(681,731);
        String bairroAgeDetalhe = detalhe.substring(731,751);
        String cidadeAgeDetalhe = detalhe.substring(751,771);
        String ufAgeDetalhe = detalhe.substring(771,773);
        String cepAgeDetalhe = detalhe.substring(773,781);
        String contaCorrenteDetalhe = detalhe.substring(781,797);
        String tmDetalhe = detalhe.substring(797,800);
        String templateDetalhe = detalhe.substring(800,810);
        String tm2Detalhe = detalhe.substring(810,811);
        String complementeDetalhe = detalhe.substring(811,831);
        String codPlastDetalhe = detalhe.substring(831,834);
        String empresaDetalhe = detalhe.substring(834,853);
        String fotoDetalhe = detalhe.substring(853,861);
        String vllimiteDetalhe = detalhe.substring(861,873);
        String diavencDetalhe = detalhe.substring(873,875);
        String codigoBarrasDetalhe = detalhe.substring(875,885);
        String deficienteVisualDetalhe = detalhe.substring(885,886);
        String senhaDetalhe = detalhe.substring(886,902);
        String trilha01IcvvDetalhe = detalhe.substring(902,980);
        String trilha02IcvvDetalhe = detalhe.substring(980,1019);
        String ccrAntigoDetalhe = detalhe.substring(1019,1031);
        String codigoCartaoDetalhe = detalhe.substring(1031,1043);
        String nomeOriginalComercialDetalhe = detalhe.substring(1043,1063);
        String matriculaDetalhe = detalhe.substring(1063,1083);
        String cargoDetalhe = detalhe.substring(1083,1113);
        String documentoDetalhe = detalhe.substring(1113,1124);
        String dddDetalhe = detalhe.substring(1124,1126);
        String telefoneDetalhe = detalhe.substring(1126,1135);
        String vagoDetalhe = detalhe.substring(1135,1140);
        String panvasDetalhe = detalhe.substring(1140,1156);
        String numeroEnderecoDetalhe = detalhe.substring(1156,1166);
        String complementoEnderecoDetalhe = detalhe.substring(1166,1196);
        String fillerDetalhe = detalhe.substring(1197,1200);

        //Iniciando separação da linha 4 Trailler Lote:

        String tipRegTraillerLote = traillerLote.substring(0,1);
        String modPlastTraillerLote = traillerLote.substring(1,4);
        String kitTraillerLote = traillerLote.substring(4,10);
        String qtdCartLote = traillerLote.substring(10,17);
        String fillerTraillerLote = traillerLote.substring(17,1200);

        //Iniciando separação da linha 5 Trailler Geral:

        String tipRegTraillerGeral = traillerGeral.substring(0,1);
        String qtdCartArqTraillerGeral = traillerGeral.substring(1,8);
        //String fillerTraillerGeral = traillerGeral.substring(8,1200);
        //Comen

    }

}
