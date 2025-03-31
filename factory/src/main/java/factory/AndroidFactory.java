package factory;

import model.Phone;
import model.Tablet;
import model.android.AndroidPhone;
import model.android.AndroidTablet;

public class AndroidFactory implements DeviceFactory {

  public Phone createPhone() {
    return new AndroidPhone();
  }

	public Tablet createTablet() {
    return new AndroidTablet();
  }
}
