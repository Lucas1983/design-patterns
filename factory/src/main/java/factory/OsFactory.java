package factory;

import model.Phone;
import model.Tablet;
import model.os.OsPhone;
import model.os.OsTablet;
import model.system.Os;

public class OsFactory implements DeviceFactory<Os> {

  public Phone<Os> createPhone() {
    return new OsPhone();
  }

  public Tablet<Os> createTablet() {
    return new OsTablet();
  }
}
