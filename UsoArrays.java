import javax.swing.JOptionPane;

public class UsoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=Integer.parseInt(JOptionPane.showInputDialog("Dame una opción (1-2)"));

		   if(opcion==1) {

			Arrays miArray=new Arrays(5);

			miArray.getDatosArray();

					
		   }else {
			if(opcion==2) {
						
			 int cont=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos nombres quieres introducir?"));
			 VectorNombres vNombre=new VectorNombres(cont);
						
			  for (int i=0;i<cont;i++) {
				String nom=JOptionPane.showInputDialog("Dame un nombre:");
				vNombre.setGuardarNombre(nom);
			  }
						
		         vNombre.getNombres();
			}
		    }

	}

}
