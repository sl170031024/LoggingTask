package log4jtask;

import org.apache.logging.log4j.LogManager;

public class House {
	double r1=0;
	private static final org.apache.logging.log4j.Logger LOGGER1 =LogManager.getLogger(HouseDefining.class);
	double cost(String s,double r,String y)
	{
		if (s.equals("StandardMaterials"))
		{
			
			
			r1=r1+(1200*r);
			
			LOGGER1.info(r1);
			LOGGER1.error("There will be corrrection");
			LOGGER1.warn("there is something wrong in code");
			LOGGER1.fatal("there is any case of abort");
				
		}
		
		else if (s.equals("above standard materials"))
		{
			
			r1=r1+(1500*r);
				LOGGER1.info(r1);
			LOGGER1.error("There will be corrrection");
			LOGGER1.warn("there is something wrong in code");
			LOGGER1.fatal("there is any case of abort");
			
		}
		else
		{
			if (y.equals("fully automated home" ))
			{r1=r1+(2500*r);
			}
			else
			{
				r1=r1+(1800*r);
			}
				LOGGER1.info(r1);
			LOGGER1.error("There will be corrrection");
			LOGGER1.warn("there is something wrong in code");
			LOGGER1.fatal("there is any case of abort");
			
			
		}
		
		
	return(r1);	
	}

}
