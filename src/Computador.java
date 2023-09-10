public class Computador
{
    public float preco;
    public String marca;
    HardwareBasico hardwareBasico;
    SistemaOperacional sistemaOperacional;
    Cliente cliente;
    MemoriaUSB memoriaUSB;

    public Computador(){
        hardwareBasico = new HardwareBasico();
        sistemaOperacional = new SistemaOperacional();
    }

    public void mostraPCConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Hardware Básico:");
        System.out.println(" - Nome: " + hardwareBasico.nome);
        System.out.println(" - Capacidade: " + hardwareBasico.capacidade + " GB");
        System.out.println("Sistema Operacional:");
        System.out.println(" - Nome: " + sistemaOperacional.nome);
        System.out.println(" - Tipo: " + sistemaOperacional.tipo + "-bit");

    }

    public void addMemoriaUSB(){
        System.out.println("Memoria adicionada");
    }
}
