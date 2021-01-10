public class Main {

    public static void main(String[] args) {
        LinkedList lista = new LinkedList();

        Paciente p1 = new Paciente("Gon", (byte) 12, 'm');
        Paciente p2 = new Paciente("Killua", (byte) 12, 'm');
        Paciente p3 = new Paciente("Leorio", (byte) 20, 'm');
        Paciente p4 = new Paciente("Kurapika", (byte) 17, 'm');
        Paciente p5 = new Paciente("Netero", (byte) 50, 'm');

        lista.AdicionaComeco(p1);
        lista.AdicionaComeco(p3);
        lista.AdicionaComeco(p5);
        lista.AdicionaComeco(p2);
        lista.AdicionaComeco(p4);

        for(int i = 0; i<lista.Tamanho(); i++){
            Paciente paciente = (Paciente) lista.Pega(i);
            Imprimir(paciente);
        }

        lista.removeDoComeco();

        Paciente p6 = new Paciente("Zorro", (byte) 25, 'm');
        Paciente p7 = new Paciente("Sanji", (byte) 27, 'm');

        lista.adiciona(3, p6);
        lista.adiciona(2, p7);

        for(int i = 0; i<lista.Tamanho(); i++){
            Paciente paciente = (Paciente) lista.Pega(i);
            Imprimir(paciente);
        }
    }
    static void Imprimir(Paciente paciente){
        System.out.println("------------------");
        System.out.println("Nome:"+paciente.getNome());
        System.out.println("Idade: "+paciente.getIdade());
        System.out.println("Sexo: "+paciente.getSexo());
        System.out.println("------------------");
    }
}
