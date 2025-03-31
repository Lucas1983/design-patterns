package factory;

import model.Phone;
import model.Tablet;
import model.android.AndroidPhone;
import model.android.AndroidTablet;
import model.system.Android;

public class AndroidFactory implements DeviceFactory<Android> {

  public Phone<Android> createPhone() {
    return new AndroidPhone();
  }

  public Tablet<Android> createTablet() {
    return new AndroidTablet();
  }
}
