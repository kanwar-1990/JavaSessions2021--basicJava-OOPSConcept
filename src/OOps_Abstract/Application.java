package OOps_Abstract;

public abstract class Application {

public abstract void ServerSetup();
public abstract void DBSetup();
public abstract void envSetup();

//Though we have achieved 100% Abstraction, Anyone can add Non abstract method aswell or do any changes , which might create a noise 

public void UILayer()
{
	System.out.println("Added Red Colour");
}



}
