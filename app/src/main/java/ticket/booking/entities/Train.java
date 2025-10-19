package ticket.booking.entities;

import java.sql.*;
import java.util.*;

public class Train {
    private String trainId;
    private String trainNo;
    private List<List<Boolean>> seats;
    private Map<String, Time> stationTimes;
    private List<String> stations;
}
