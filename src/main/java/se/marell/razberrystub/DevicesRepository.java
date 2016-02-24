/*
 * Created by Daniel Marell on 2016-02-24.
 */
package se.marell.razberrystub;

import org.springframework.stereotype.Component;

@Component
public class DevicesRepository {
    DevicesData data;

    public DevicesData getData() {
        return data;
    }
}
