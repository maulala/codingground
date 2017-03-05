public class Tugas10{
	public static void main(String[] args){
		BiodataTgs10 b = new BiodataTgs10();

		b.setNama("Maula Hashina Dina");
		b.setUmur(20);
		b.setAlamat("Jepara");

		String namaPrint = b.getNama();
		int umurPrint = b.getUmur();
		String alamatPrint = b.getAlamat();

		System.out.println("Nama : " + namaPrint + "\nAlamat : " + alamatPrint + "\nUmur : " + umurPrint);
	}
}
