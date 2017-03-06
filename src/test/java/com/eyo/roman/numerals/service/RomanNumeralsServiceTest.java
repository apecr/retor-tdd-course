package com.eyo.roman.numerals.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eyo.roman.numerals.config.ConfigRomanNumeralsContext;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ConfigRomanNumeralsContext.class })
public class RomanNumeralsServiceTest {
    
    @Autowired
    private RomanNumeralsService romanNumeralsService;
    
    @Test
    public void notNull(){
        assertNotNull(this.romanNumeralsService);
    }
    
    @Test
    public void whenNumber0ReturnEmpty(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 0 );
        //Then
        assertEquals( "", romanNumeral );
    }
    
    @Test
    public void whenNumber1ReturnI(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 1 );
        //Then
        assertEquals( "I", romanNumeral );
    }
    
    @Test
    public void whenNumber2ReturnII(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 2 );
        //Then
        assertEquals( "II", romanNumeral );
    }
    
    @Test
    public void whenNumber3ReturnIII(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 3 );
        //Then
        assertEquals( "III", romanNumeral );
    }
    
    @Test
    public void whenNumber4ReturnIV(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 4 );
        //Then
        assertEquals( "IV", romanNumeral );
    }
    
    @Test
    public void whenNumber5ReturnV(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 5 );
        //Then
        assertEquals( "V", romanNumeral );
    }
    
    @Test
    public void whenNumber6ReturnVI(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 6 );
        //Then
        assertEquals( "VI", romanNumeral );
    }
    
    @Test
    public void whenNumber7ReturnVII(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 7 );
        //Then
        assertEquals( "VII", romanNumeral );
    }
    
    @Test
    public void whenNumber8ReturnVIII(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 8 );
        //Then
        assertEquals( "VIII", romanNumeral );
    }
    
    @Test
    public void whenNumber9ReturnIX(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 9 );
        //Then
        assertEquals( "IX", romanNumeral );
    }
    
    @Test
    public void whenNumber10ReturnX(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 10 );
        //Then
        assertEquals( "X", romanNumeral );
    }
    
    @Test
    public void whenNumber11ReturnXI(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 11 );
        //Then
        assertEquals( "XI", romanNumeral );
    }
    
    @Test
    public void whenNumber15ReturnXV(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 15 );
        //Then
        assertEquals( "XV", romanNumeral );
    }
    
    @Test
    public void whenNumber18ReturnXVIII(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 18 );
        //Then
        assertEquals( "XVIII", romanNumeral );
    }
    
    @Test
    public void whenNumber19ReturnXIX(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 19 );
        //Then
        assertEquals( "XIX", romanNumeral );
    }
    
    @Test
    public void whenNumber21ReturnXX1(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 21 );
        //Then
        assertEquals( "XXI", romanNumeral );
    }
    
    @Test
    public void whenNumber27ReturnXXVII(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 27 );
        //Then
        assertEquals( "XXVII", romanNumeral );
    }
    
    @Test
    public void whenNumber32ReturnXXXII(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 32 );
        //Then
        assertEquals( "XXXII", romanNumeral );
    }
    
    @Test
    public void whenNumber45ReturnXLV(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 45 );
        //Then
        assertEquals( "XLV", romanNumeral );
    }
    
    @Test
    public void whenNumber50ReturnL(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 50 );
        //Then
        assertEquals( "L", romanNumeral );
    }
    
    @Test
    public void whenNumber51ReturnLI(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 51 );
        //Then
        assertEquals( "LI", romanNumeral );
    }
    
    @Test
    public void whenNumber62ReturnLXII(){
        //When
        String romanNumeral = this.romanNumeralsService.convertDecimalNumberToRomanNumeral( 62 );
        //Then
        assertEquals( "LXII", romanNumeral );
    }
    
}
