package factory;

import model.Phone;
import model.Tablet;

public interface DeviceFactory {

	Phone createPhone();
	Tablet createTablet();

}
