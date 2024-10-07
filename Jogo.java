import java.util.Random;
public class Jogo {
    public static void main(String[] args) throws Exception {
        System.out.println("Começando. .");
        var cacador = new Personagem(10, 0, 0);
        cacador.nome = "Phayze";
        var gerador = new Random();
        while (true) {
            var acaoDoCacador = gerador.nextInt(3) + 1;
            switch(acaoDoCacador){
                case 1:
                    cacador.cacar();
                    break;
                case 2:
                    cacador.comer();
                    break;
                case 3:
                    cacador.dormir();
                    break;
            }
            System.out.println(cacador);
            System.out.println("=====================================");
            Thread.sleep(5000);
        }
    }
}
