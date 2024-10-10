import java.util.Random;


public class Jogo {
    public static void main(String[] args) throws Exception {
        System.out.println("Começando. .");
        var cacador = new Personagem(10, 0, 0);
        cacador.nome = "Phayze";
        var preguicoso = new Personagem(2, 10, 10);
        preguicoso.nome = "Lich";
        var gerador = new Random();
        while (true) {
            var acaoDoCacador = gerador.nextInt(3) + 1;
            switch(acaoDoCacador){
                case 1:
                    cacador.cacar();
                    cacador.morrer();
                    break;
                case 2:
                    cacador.comer();
                    cacador.morrer();
                    break;
                case 3:
                    cacador.dormir();
                    cacador.morrer();
                    break;
            }

            var acaoDoPreguicoso = gerador.nextInt(10) + 1;
            
            switch(acaoDoPreguicoso){
                case 1:
                    preguicoso.cacar();
                    preguicoso.morrer();
                    break;
                case 2, 3, 4:
                    preguicoso.comer();
                    preguicoso.morrer();
                    break;
                case 5, 6, 7, 8, 9:
                    preguicoso.dormir();
                    preguicoso.morrer();
                    break;
            }
            System.out.println(cacador);
            System.out.println("=====================================");
            System.out.println(preguicoso);
            System.out.println("=====================================");
            if(preguicoso.isMorto() || cacador.isMorto()){
                break;
            }
            Thread.sleep(5000);
        }
    }
}
