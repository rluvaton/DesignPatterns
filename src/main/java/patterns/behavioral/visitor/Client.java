package patterns.behavioral.visitor;

/**
 * Created by Nikita Shkaruba on 31.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class Client {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();

        computer.accept(new ComputerPartDisplayVisitor());
    }
}
