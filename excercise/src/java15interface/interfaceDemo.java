package java15interface;

import java15interface.interfaceDemo.phones;

public class interfaceDemo {

	
	public sealed interface ElectronicDevice permits tablest, phones {

	}
	
	public final class tablest implements ElectronicDevice{
		
	}
	public non-sealed class phones implements ElectronicDevice{
		
	}
}
