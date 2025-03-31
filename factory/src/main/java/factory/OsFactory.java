package factory;

import model.Phone;
import model.Tablet;
import model.os.OsPhone;
import model.os.OsTablet;

public class OsFactory implements DeviceFactory {

	public Phone createPhone() {
    return new OsPhone();
  }

	public Tablet createTablet() {
    return new OsTablet();
  }
}
