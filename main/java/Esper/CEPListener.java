package Esper;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

/**
 * Created by mymint on 28/02/15.
 */
public class CEPListener implements UpdateListener {

    public void update(EventBean[] newData, EventBean[] oldData) {
        System.out.println("Event received:" + newData[0].getUnderlying());
    }
}