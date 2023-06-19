/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalreservationsystem;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;


import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.mockito.Matchers.anyString;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class DoctorTableTest {

 
    @Mock
    private Connection connection;

    @Mock
    private Statement statement;

    @Mock
    private ResultSet resultSet;
    
    @Mock
    private ConnectionManager connectionManager;

    private DoctorTable doctorTable;

    @Before
    public void setUp() throws SQLException {
        MockitoAnnotations.initMocks(this);

        when(connection.createStatement()).thenReturn(statement);
        when(statement.executeQuery(anyString())).thenReturn(resultSet);

        doctorTable = new DoctorTable(connectionManager);
        when(connectionManager.getConnection(anyString(), anyString(), anyString())).thenReturn(connection);
        when(connection.createStatement()).thenReturn(statement);
        when(statement.executeQuery(anyString())).thenReturn(resultSet);
    }
    

    @Test
    public void testGetDoctorsData() throws SQLException {
        when(resultSet.next()).thenReturn(true, false);
        when(resultSet.getString("DOCTORNAME")).thenReturn("Test Name");
        when(resultSet.getString("DOCTORUSERNAME")).thenReturn("Test Username");
        when(resultSet.getString("DOCTORPHONENUMBER")).thenReturn("Test PhoneNumber");
        when(resultSet.getString("DOCTORADDRESS")).thenReturn("Test Address");
        when(resultSet.getString("DOCTORSPECIALIZATION")).thenReturn("Test Specialization");
        when(resultSet.getString("DOCTORGENDER")).thenReturn("Test Gender");

        assertNotNull(doctorTable.getDoctorsData());
    }


 @Test(expected = SQLException.class)
public void testGetDoctorsDataSQLException() throws SQLException {
        // Given
        DoctorTable doctorTable = new DoctorTable(connectionManager);
        when(connectionManager.getConnection(anyString(), anyString(), anyString())).thenThrow(SQLException.class);

        // When
        doctorTable.getDoctorsData();

        // Then exception is thrown
    }
}
