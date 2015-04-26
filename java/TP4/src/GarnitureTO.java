import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import sun.misc.BASE64Encoder;


public class GarnitureTO implements Serializable {

	private static final long serialVersionUID = 4109922220301066416L;
	public boolean fromage;
	public boolean saucisse;
	public boolean peperoni;
	public boolean olives;
	public boolean sansGluten;


}
