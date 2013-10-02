Cantonese Romanization
======================

Convert Chinese characters to Cantonese pinyin.

[![Build Status](https://travis-ci.org/caiguanhao/cantonese-romanization.png?branch=master)](https://travis-ci.org/caiguanhao/cantonese-romanization)

## Java

### Performance

``H->P .. Hanzi2Pinyin.fromChar("龠")``: convert hanzi to pinyin.  
``P->H .. Pinyin2Hanzi.fromPinyin("yung")``: convert pinyin to hanzi.  
``H<->P``: run both conversions.  
``P->H`` operations of Decimal and Octal are the same.  
Measured in milliseconds.

Decimal (fastest):

    Times     H->P   P->H   H<->P   
    1         0      0      0       
    10        0      1      0       
    100       0      6      7       
    1000      0      59     36      
    10000     5      146    24      
    100000    17     163    168     
    1000000   161    1581   1684    

Octal:

    Times     H->P   P->H   H<->P   
    1         0      0      0       
    10        1      1      2       
    100       11     6      17      
    1000      95     40     77      
    10000     132    113    55      
    100000    222    151    456     
    1000000   2224   1465   4552    

String comparison (slowest):

    Times     H->P   P->H   H<->P   
    1         1      0      0       
    10        2      1      2       
    100       21     2      24      
    1000      209    17     227     
    10000     2179   184    2385    
    100000    21731  1802   23578   
    1000000   218359 18264  230221  
