package si.fri.prpo.zrna;

import java.util.ArrayList;
import javax.ejb.Local;
import si.fri.prpo.vaje.entitete.Narocilo;

@Local
public interface UpravljalecNarocilSBLocal {
	
	int addOrder(int idUporabnik, int idKavarna, int prepTime, String prepStatus, String paymentStatus, double totalPrice);
	void addDrinks(int idNarocila, int[] idsNapitka);
	boolean cancelOrder(int id);
	ArrayList<Narocilo> returnAll();
	Narocilo returnOrderId(int id);
	int getPrepTime(int[] ids);
	double getTotalPrice(int[] ids);
	int[] getNapitekIds(String[] napitki, String size);
	int getIdKavarna(String name);
	ArrayList<Narocilo> getUserOrders(int userId);
}
