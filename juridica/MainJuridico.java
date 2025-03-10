public class MainJuridico {

    public static void main(String[] args) {
        Fisica fisica = new Fisica("João", "1234-5678", "123.456.789-00", "12.345.678-9", "01/01/1980");
        Juridica juridica = new Juridica("Empresa", "1234-5678", "12.345.678/0001-00", "123456789");
        System.out.println(fisica);
        System.out.println();
        System.out.println(juridica);
    }
}