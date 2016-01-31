package patterns.behavioral.strategy.behaviours;

import patterns.behavioral.strategy.RobotBehaviour;
/**
 * Created by Nikita Shkaruba on 31.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class NormalBehaviour implements RobotBehaviour {
    @Override
    public void moveCommand() {
        System.out.print("\t**> Current objective is moving, if find another robot ignore it. ");
    }
}
