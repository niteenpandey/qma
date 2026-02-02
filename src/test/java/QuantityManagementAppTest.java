package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityManagementAppTest {

    @Test
    public void testFeetQualitySameValue(){
        QuantityManagementApp.Feet feet1 = new QuantityManagementApp.Feet(1.0);
        QuantityManagementApp.Feet feet2 = new QuantityManagementApp.Feet(1.0);

        Assert.assertTrue("Feet 1 and Feet 2 shuould be same ",feet1.equals(feet2));
    }

    @Test
    public void testFeetQualityDifferntValue(){
        QuantityManagementApp.Feet feet1 = new QuantityManagementApp.Feet(1.0);
        QuantityManagementApp.Feet feet2 = new QuantityManagementApp.Feet(2.0);

        Assert.assertFalse("Feet 1 and Feet 2 shuould not be same ",feet1.equals(feet2));
    }

    @Test
    public void testFeetQualityNullValue(){
        QuantityManagementApp.Feet feet1 = new QuantityManagementApp.Feet(1.0);


        Assert.assertFalse("Feet 1 and Feet 2 shuould not be same ",feet1.equals(null));
    }

    @Test
    public void testFeetQualityDiffClasses(){

        QuantityManagementApp.Feet feet1 = new QuantityManagementApp.Feet(1.0);
        QuantityManagementApp1.Feet feet2 = new QuantityManagementApp1.Feet(1.0);

        Assert.assertFalse("Feet 1 and Feet 2 shuould not be same ",feet1.equals(feet2));

    }

    @Test
    public void testFeetQualitySameReferences(){

    }

}