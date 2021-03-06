package patterns.structural.composite.units;

import patterns.structural.composite.CannotAddToLeafException;
import patterns.structural.composite.Unit;
/**
 * Created by Nikita Shkaruba on 23.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Component implementation 3
public class Infantryman implements Unit {
    @Override
    public int getStrength() {
        return 2;
    }
    @Override
    public void addUnit(Unit unit) throws CannotAddToLeafException {
        throw new CannotAddToLeafException();
    }
}
