package com.undertale.fecade.attackimage;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Image {
    public static void getBossFight() {
    	System.out.println("                                               rSX.                    iSXi                                                                                     \r\n" + 
    			"                                             .ri :;:                  ir..;r                                                                                    \r\n" + 
    			"                                            S2  :7X@S                8ZS7  iZr                                                                                  \r\n" + 
    			"                                          ,0,  8r  ;                 .i  Z7  XZ                                                                                 \r\n" + 
    			"                                          XB   07                        ZX   M                                                                                 \r\n" + 
    			"                                           B.   ;2;.       ,Z2        ,XS,   Xa                                                                                 \r\n" + 
    			"                                            8     XaX  7aSZ80BZZSSi ,Sa;    :S                                                                                  \r\n" + 
    			"                                        MMa.XX      :SZaZ2;S:rXr2aa87,     iX7:8MB                                                                              \r\n" + 
    			"                  i,                    MWBM@WMS      a.X7XSiiarXii2      BMW@M0MM                    ;                                                         \r\n" + 
    			"                  MWS22:.:,:,:,:,:      SMaaa8ZMWr   2i ,ai7@0i7S. Xr   SMWZZaS0Mi      ,:::,i:::,iZXaMB                                                        \r\n" + 
    			"           XW.rZZ 2WX2088Z8Z8Z88088888X,,WM8ZaZa0@07Xri .,77XXXr. ,;XXSWMZZaZa0Ma :2BZ8BM0080Z8Z888aX0Mi                                                        \r\n" + 
    			"      .Xr  0W8W@X  B7::i,::i::    :;i;XZXa0B08aZ80Srir;i.. .     ,;r;;7Z08ZZaZWBSZ88X;i;:           ,WZ                                                         \r\n" + 
    			"      7WB8B8B8000, :8:ii;:iir;r;;i:        .X80Z8Xiir;rr7;i.,.:irr7;;;i:Sa8ZZ2ri, .   . ..:.,.,.,,;i8M:                                                         \r\n" + 
    			"         :aB80800W2;ZZ:..;,,:;;r;r;rii....   ;B0;r;XX;;rrXr7r7r777;ri2r7iXZ8Xi:;,..,.:.,.,.,.:i;;;i8@.                                                          \r\n" + 
    			"        X0a8B0B0B0B0B8arZM@Zi,ii;;r;rrr;i.,.. rM8  :2ir ,r77X77;: i;;S  .M8Xi:;;r:,...:,i:i;;;;iirWZ,                                                           \r\n" + 
    			"       :M028W82@WW0B000MMMMMXi..,ii;;r;rr;,:..,W8  S;r;;   ; ,,  :rri7;  M;,:;;r;7ii:;;r;;ii:;rXZWi                                                             \r\n" + 
    			"        . 8M7   r2WWB8Z0MMM0@MBar,,:;i;;r;rrri:SB 7rr;7;r, .  ;,rrr;r;S, M2.,:ii;i;ii:i:::irSaZZ@M                                                              \r\n" + 
    			"          r:       :raaMMMBMMWMMMMZ;:::;;r;;i7SSMX:XrXrrir;,,,:riir777X,0MMW07i:,,:;:i7SX000aZZZWM                                                              \r\n" + 
    			"                     ;MMMBMM@@MWMM@082;,::i;227iBMi    a2;; i :r;Zi    XMX,XMM0S22WW@B@MMMMM82Z2W@                                                              \r\n" + 
    			"                    SMM@B0@WBMM@MBa88B8S7i;Sri,:7MM    WB08S:;S02M7   rM8r,,:ZMMMMMMMMMMMMMMWaSaZM7                                                             \r\n" + 
    			"                  SMMMMMM@@0@@0W@SZZZZ00B8ZXiii,,7MMBZ08ZZ88228ZZZB80MMar:;ii.iBMMWWMMMM@B@@M0a2aMW                                                             \r\n" + 
    			"                 SMMMMMMMMMM@M0MM0aa82SZZ00000ZX, .ZMMBZaa2aa8ZZZ88M@8r::;;;i: ,@MB@MMMM@@W@@Ma22MZ                                                             \r\n" + 
    			"                 MMMMMM@MMMMMM@WMMMMMM@822aZ88B0Z7i :aBMM@@WM@M@MMMBa::i;;;iXi,SMMWMMMMMMW@WMMWa20M,                                                            \r\n" + 
    			"                 @MMMMMM@M@MMMM@BMMMMMMM@MBZa22ZZ00Z7:.:78@Z2a2W8X::,ii;:i:,:WMMM@MMMM@MMMW@WMM0SaMX                                                            \r\n" + 
    			"                 MMMMMM@M@M@MMMWBMMMMMMM0MMMM@BZ0ZaZ08ZXii:     ;i::iii;7. iBMMMBBMMMMMMMMMW@@M022@8                                                            \r\n" + 
    			"                 0MMMMMMMM@MMMMBWM@MMMM0X8MMMMMMMM@ZSZa88B8ZXr. .Xr...:8MWBMMMMMS0MMMMMMMMM@W@@MZ2ZM.                                                           \r\n" + 
    			"                  MMMMMMM@MMMMM8MMMMMMWS2SaWMMMMMMMMMMMBXX0BWB8S;rZZ8aMMMMMMMMB2SSWMMMMW@@MM@WMM8S0M                                                            \r\n" + 
    			"                  BMMMMMMMMMMMB@MMMM@ZSaaZ22ZMMMMMMMMMMMWX :ra8B08ZM@MMMMMMMWZS222S@MWB@WWBMMMM@a2ZM7                                                           \r\n" + 
    			"                   ZMMMMMMMMM0MMMMM82SaaZaZ22S0MMMMMMMMMMMW;;rS2ZaZZZaaZ@@WZ2SZ2a2SXBMMMMMMWWWWaa2aWM                                                           \r\n" + 
    			"                    @WZBWMMM@MMMM@2S2ZaZaZaZZZ2S0MMMMMMMMMMMMMMMMMMB8000ZaX2Sa2aaZSXBMMMMMMMMWSSaZ2BM                                                           \r\n" + 
    			"                    M0SX222ZB0B2aS2aZaZaZaZZ0a;.irXS08WMMMMMMMMMMBWWZ7X28BW082S8MMWZBMMMMMMMMMWSaaZ2MZ                                                          \r\n" + 
    			"                    @B2Z2a22S2S22aaZaZaZZ888Xi,7X7;;iii7r7;r;r;7r::iii:.:riX208MMM@M@0BW@MMMMMW22ZaaM8                                                          \r\n" + 
    			"                   8M2ZaZaZaZaZaZaZaZaZa082i::rXXXX7X7XrX;:,::i,::;:, .,;:  WMMMMWMMB@MB0BMMMM@2ZaZaZMr                                                         \r\n" + 
    			"                   0@aaZaZaZaZaZaZaZaZZ02r,i:;XXXXXXXXXXX7i;;:.,.,.,  .;;;:iMMMMWMMW@MWMMBMMMM0aaZaZaMr                        .                                \r\n" + 
    			"                  XM82ZaZaZaZaZaZaZaZZai..,.,;7;r;r;r7XXXi;;r,..:,,   ,,,., ;8BZaZMWMWBM@aZ0WSS2ZaZaZ0M                      rM0                                \r\n" + 
    			"                  7MaZaZaZaZaZaZaZaZZaXX7XX2XSXSXXXSSrrS7;;rr:.:::   Xa2S2SS77rX;;ZBBMM@2SSZZ0ZZS22a20M                      0@0                                \r\n" + 
    			"                  MBaaZaZaZaZaZaZaZaZa8ZZZMMMMMMMMMMMa;7;ir;7,,,, ..SMMMMMMMMMMMMaSSS2Zaa2aSa2Z808Z2aSM2                     aWBW,                              \r\n" + 
    			"                 ,MZ2ZaZaZaZaZaZaZaZaZaZa@MMMMMMMMMMMMX;i;;rr:., ,:SMMMMMMMMMMWMMMaaaa2aaZaZaZ222ZZ0808Z:                    aBBBBr                             \r\n" + 
    			"                 W@2ZaZaZaZaZaZaZaZaZaZSZMMMMMMMMMMMMMMX,i;;7,..::aMMMMMMMMMMM@WMM8SZaZaZaZaZZZZZ2aSaa00WW87.7:     .        SB0BB@S                            \r\n" + 
    			"                7MZaaZaZaZaZaZaZaZaZaZa2ZMMM@MMMMMMMMMMMr:ir;, ii2WMMMMM@MMMMM@WMM82aZaZaZaZaZaZaZZZaaS2Z0W@W@@W2i7Z@S.      ZBB8WW@8:                          \r\n" + 
    			"                MWaaZaZaZaZaZaZaZaZaZaZS@MMMM@MMMMM@MMMMZ7:ir:iiaZaWMMMMM@M@MMMWMMM2aaZaZaZaZaZaZaZaZaZaWWiZ@W@WWB@Z08W0,   rWWa :a@MMa                         \r\n" + 
    			"               XMZaZaZaZaZaZaZaZaZaZaZ22BMMMMM@MMMMMMMM0a8XiiiiZ8Z2ZMMMMMMMMMMMMWM@a2ZaZaZaZaZaZaZaZaZaa8M  ,2S0ZZa80ZZWZ,  ;WWa   ;a@MM7                       \r\n" + 
    			"              iM02ZaZaZaZaZaZaZaZaZaZaaSWMM@M@MMMMMMMM8SZZ0X,:a8ZaZSZ@MMMMMMM@M@WM@SaaZaZaZaZaZaZaZaZaZaaWM     2W0800WaBW0SWBa       a@MMW.                    \r\n" + 
    			"             .MBaZaZaZaZaZaZaZaZaZaZaZSBMMMM@MMMMMMWZaSaaZZ872ZZZZaZS228WMMMMMMMWMMBSaaZaZaZaZaZaZaZaZaZaaMB     Z088;rBWW0B00r         i78MWX                  \r\n" + 
    			"             M@2ZaZaZaZaZaZaZaZaZaZaZa20MMMMMMMMMMZX22aaZaZZ8ZZZZaZaZ2aSSZMMMMMMMMMB22ZaZaZaZaZaZaZaZaZaZaZMZ           :aB0BB@W8r.        ;BMWS:               \r\n" + 
    			"            WMaZaZaZaZaZaZaZaZaZaZaZaaZMMMMMMMMMMM2aaZaZaZaZaZaZaZaZaZaZ28BMMMMMMMMM0aaZaZaZaZaZaZaZaZaZaZaZMS           2BW27aMMMMWSS.       i8WMZ;:           \r\n" + 
    			"           ZMaZaZaZaZaZaZaZaZaZa8Z080W@MMMMMMMM2X 08aaZaZaZaZaZaZaZaZaZZW; 7MMMMMMMMMWB80ZZaZaZaZaZaZaZaZaZ20Mr        .ZW@2    ;;Z@MMMBa:       ,SBMMB,        \r\n" + 
    			" ... 7a2228MZZaZaZaZaZaZaZaZ888MWBBW0X            MMBWBBBBBBBWBBBWBWBWBMM            70WBBWM8ZaZaaaZaZaZaZaZa0WZS2Sa. :MW0.         :a0MMM@0r.       7;         \r\n" + 
    			"ZMMMMMMMMMWZ8Z8Z8Z8Z8Z8ZWWMM8BWi                ,7;7B008B0B0000000B800ZiZr,                :ZWM@@08Z8Z8Z8Z8Z8Z8WMWMMMXB0B2              7ZMMMMBSX               \r\n" + 
    			" ,.. rZ0MM@MMMMMMMMMMMMM0ZZ; rX ;;  0  ,XSSSS2SZS.                       ;XaS2X2SSS:  8  .X iZ7Za@MMMMMMMMMMMM@MBBB0BWBB0WWMM8Z8ai         rr8@MMM0a:           \r\n" + 
    			"                              ;X@BSSMa2Xi,:::,i                             :,:,:::7aSM2S8MX7                    ZWB@W@W@@M@MMMMMMM87rX.       :aBMMMWZr.       \r\n" + 
    			"                                                                                     .                          ZBX  . . . . .....XWMMMMMZ;       .S8MMMMWXX    \r\n" + 
    			"                                                                                                                :                     ,XSSB@B7,       rr0MM@M0i \r\n" + 
    			"                                                                                                                                            :aM2           70@W,");
    }

    public static void getBoss() {
    	System.out.println("                                                                                            \r\n" + 
    			"                                                                                                                                                      \r\n" + 
    			"                                                         .r7                              i7:                                                         \r\n" + 
    			"                                                        SZ2SZ;                          ,2aSZa.                                                       \r\n" + 
    			"                                                      i07   :22,                       X2X   i82                                                      \r\n" + 
    			"                                                    .ZZ   .aaXBB                      XMXSZi   70i                                                    \r\n" + 
    			"                                                   XB:   XZ: .r                        ii  2S,   ZZ                                                   \r\n" + 
    			"                                                   0B   XM                                  BW   ,M                                                   \r\n" + 
    			"                                                   B8    :8S                              i0r    ,M                                                   \r\n" + 
    			"                                                   ,M:     X0i            7S            .ZZ.     @X                                                   \r\n" + 
    			"                                                    iM       ZZ,         rMB8          28;      BZ                                                    \r\n" + 
    			"                                                     7M       iZS   ,B@. Mi M; 0@7   i87       8B                                                     \r\n" + 
    			"                                                      28,       X82XS@XZ;M. MarZ8W;ZaZ        2B                                                      \r\n" + 
    			"                                                       ,8a.    .r2@MXW0 2S;7XZ;7M;MMBS:     X0r                                                       \r\n" + 
    			"                                                         r0X .;88Z7;,S02;70W27a@a:i;aBWS, :0S                                                         \r\n" + 
    			"                                                           XWS0@..;;i  rX7XXX7S  ,ri:.ZM20Z.                                                          \r\n" + 
    			"                                                             ZM.,;rr         .    ,7;;.WM.                                                            \r\n" + 
    			"                                                             ,M.ir7  i2S2X  ;S2SX  i7;:8a                                                             \r\n" + 
    			"                                               ZMZ          .M::;7.,aBZZ,.    X8B0i.iri:@S          ;M@                                               \r\n" + 
    			"                                               7M@MBZZ,     Mr.:r; aM.782X  ;2WX 0M :ri.:Mr     2Z0MMM0                                               \r\n" + 
    			"                   0@X                          MW20W@MMWaZZ: 78ir  7 MM      MM :i i;X0,:Z020MMWW0ZaM                           MWi                  \r\n" + 
    			"                  .MXBZZZ,,.,.,.,.,.,.:         rBBaaaZa8MM7;7MM:;:  .aZ      XZ7   r:ZMaraMMBZaZ2a8W2         ,,.,.,.,.,.,.,X8ZBXM2                  \r\n" + 
    			"                   Z8:rXSBBWBWBWBWBWBWWBZZZ8ZX.. ,Z0ZaaZaaM8X;rM.r7,    Xa  ;8     rr:ZB SXMBZ2Z2Z80;  .i8ZZZZ8@BWBWBWBWBWBWBZ7X:XW,                  \r\n" + 
    			"                    Mi,.:,:,:,,,,.,.,,:iX7XXXaWBBZ2WMBZ2ZSM,  BX:;rr777,rr:,;r:;Xr7rr:7W   MWZa20MMSZ0BB0XSXSXX,:,:,:,,,,,:.:,:..@2                   \r\n" + 
    			"                    7M.::i:i:i:i:i:i:i::,:::,:,:.::;:2W022M: 8Z.ir;rr;,        ::7;r;;.XW  MBZaWWSii.,.:,:,:,::i:i:i:i:i:i:i::::0W                    \r\n" + 
    			"                    rM;,i:i:iii:i:i:iii:i:i:i:i:i::.:.;M8SM: M..;iii7 :Zr28Z8;aX r;ii::.M; MB2M0i::,::i:i:i:i:i:i:i:i:iii:i:ii;rM0                    \r\n" + 
    			"                     i@2:;:i:iiiiiiiii:iiiiiii:i:iii:i,XM2aM M,aZS8S::  7,   X. .i;02202M:8M2@W;:i:i:iiiiiii:iiiiiiiiiii:i:;iiSM7                     \r\n" + 
    			"                      rWaii:::iiiii:i:i:iiiii:iiiii:i::i@@2WZrZ;ra:S0:;        i:S0,SX,82rM88MZ:;:i:iiiiiiiiiiiii:i:i:i:i:;i;ZMa                      \r\n" + 
    			"                        2BS7.::::i:i:iii:iiiiiii:iii:i,:i@BaMX      M@B@ri,i:;8M8M7      M08@8:;ii:iiiiiiiiiiiii:iii:i:ii;78WB.                       \r\n" + 
    			"                         .aZBX:,i:i:i:i:iii:iii:iii:i:,.. 2M8M;    2M0ZMMMX,MMMBWWW     MWMWr.:,::i:i:iiiiiiiii:i:i,i:i:SWWS;                         \r\n" + 
    			"                           XM@8ri,.,,::i:i:i:i:i:i:i::;S082ZW0@XXSSMaZZZBMMWMM08a2@8XSX0WW0Z082r,,,i:i:i:i:i:i::,,::,;70@M@                           \r\n" + 
    			"                           7MSB@@Z0X;;,.,,:,:,,:i:i,;ZBZr;i M@WMMMM0a2aa2aMMBZZ2a28@MMM@0Mr 7ra0B7:::::,,,,,,,,:rrSBB@M@0@@                           \r\n" + 
    			"                           XM22aZBB@@MZ0Sii;i;;:., 7B7 i:i::ZMXZZ8Z0@M@@@@@MW@W@@MB8Z8Z72Wii:ii,i02..,.;i;i;ir8BMMMMW0ZZZMW                           \r\n" + 
    			"                           XM2ZaZaaaZZBB@@M@M@M088ZMZ 88ii;::B0,   .;i;ii:::i:;i;;: .  7Wi:;;:20i;MZ8Z0MMMMMMMM@BZZ2a2a28M@                           \r\n" + 
    			"                           rMaaZaZaZaZ2Z2ZaZaZa0W@BM0Zr,r;;;i,X@ZXr, ...ir;r;r.....r7X0a,:;rir:iZWMMWWB0Z8Z8ZZ2a2a2ZaZaZZMB                           \r\n" + 
    			"                           0W2ZaZaZaZaZaZaZaZaZ2a2aXMX,8Z:;;;i::8BB88S2000B0B0BZXZ888Z;.;;r;iXB;;M0aa2a2a2a2ZaZaZaZaZaZ2ZBM:                          \r\n" + 
    			"                          iMSZaZaZaZaZaZaZaZaZaZaZaaBBar,7ir;;ii,,.rZMSr.,,:,:rSB0r. ::;;r;;;i,ZBMZaaZaZaZaZaZaZaZaZaZaaa8MB                          \r\n" + 
    			"                          8@aaZaZaZaZaZaZaZaZaZaZaZa2M;,B2ii;::...;ZZ:,,:,i;;ii,i2B7:.,,ii;:X0r,MBZaZaZaZaZaZaZaZaZaZaZaZa@W.                         \r\n" + 
    			"                          MZaZaZaZaZaZaZaZaZaZaZaZaZ2@8Z, ..:ir8Z7MX ::i:iir;;;;i:iMXaZS:;.. ,ZW@02ZaZaZaZaZaZaZaZaZaZaZaZZMX                         \r\n" + 
    			"                         SMaZaZaZaZaZaZaZaZaZaZaZaZaZ2B0aZZZMMM@@MX ::i:i:i;r;r;ri::MMMMMM0a88BB82ZaZaZaZaZaZaZaZaZaZaZaZa8MB                         \r\n" + 
    			"                         MZZaZaZaZaZaZaZaZaZaZaZaZaZaZ2ZB@W@8ZaaSM:.:i:i:iir;r;r;;::MWaZZZ0WBBZa2aaZaZaZaZaZaZaZaZaZaZaZaaa0M7                        \r\n" + 
    			"                         M8aZaZaZaZaZaZaZaZaZaZaZaZaZaZaZ2a2ZaZaa@8 ,:i:;;r;r;;;;,iaM022Zaa2a2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaaaMi                        \r\n" + 
    			"                        @@aZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaaMZ.,i;;r;;;;ii,;aMBZ2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZ2ZBM.                       \r\n" + 
    			"                        MBaaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZWMS:.iii:i:::SWM0Z2aaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaaZ0M:                       \r\n" + 
    			"                        MB2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaaZM0Z;i:::7ZWM@ZZ2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZ0M                        \r\n" + 
    			"                        M0aaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZa0W@WMMMMMW8ZZ2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZ28M.                       \r\n" + 
    			"                       0@ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZa20MZ8aZ2aaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaaZ@M                       \r\n" + 
    			"                       @M2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZS0MZ2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaa0M                       \r\n" + 
    			"                       WWaaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZa28M2aaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZ2BM                       \r\n" + 
    			"                      aMZ2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZSBMZ2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaaZM@                      \r\n" + 
    			"                      ZMSZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZa20MaaaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZ28@M                      \r\n" + 
    			"                      WBaaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZSBMa2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaaZWMi                     \r\n" + 
    			"                     aM2aZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZa20MaaaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZa88MM                     \r\n" + 
    			"                     7M2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZSBMZ2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZa8MW                     \r\n" + 
    			"                     8@aaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZa20MaaaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZZ@@.                    \r\n" + 
    			"                    rMaaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZS0MZ2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZ2ZZMB                    \r\n" + 
    			"                    ,M2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZa20MaaaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZ28MZ                    \r\n" + 
    			"                    2MaaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZSBMZ2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaa8MB                    \r\n" + 
    			"                    MZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZa20MaaaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZ2ZZMS                   \r\n" + 
    			"                   rMaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZSBMZ2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZ2ZM0                   \r\n" + 
    			"                  BMaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZa20MaaaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZa8@M                  \r\n" + 
    			"                 8MaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZSBMZ2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaaa0MM                 \r\n" + 
    			"                 M@aaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZa20M2aaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZZWM                 \r\n" + 
    			"                XMZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZSBMZ2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZ2Z8MB                \r\n" + 
    			"                W@2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZa20MaaaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZ28BM.               \r\n" + 
    			"               0M2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZSBMa2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZa8@M               \r\n" + 
    			"              :M2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZa20MaaaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZZ0M0              \r\n" + 
    			"              M0aaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZSBMZ2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaaZBM;             \r\n" + 
    			"             MWaaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZa20MaaaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZZ@M,            \r\n" + 
    			"            BMZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZSBMZ2ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZ8MM            \r\n" + 
    			"           8@ZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaa@MZaaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaaZMWi          \r\n" + 
    			"          WMaaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaBM2rMWZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZaZZMM.         \r\n" + 
    			"  ii:ii:rMBZaZaZaZaZaZaZaZaZ2aaaaZaaaaaZa0000B0B0B0B0B0B0B0B0B0B0B@MMMMMWi   8MMMMMMB00B0B0B0B0B0B0B0B0B0B0B8ZaZaZ2Z2ZaaaZaZaZaZaZaZaZaZ288WM2,i:i:;. \r\n" + 
    			" ZMMMMMMMB08ZaZaZaZa0000000WMMMMMMMMMMMMMWBBWBWBWBWBWBWBWBWBWBWBWWr:i:ii      :ii:i:0BWBWBWBWBWBWBWBWBWBWBWBWMMMMMMMMMMMMMM0B000088aZaZ2Z8WWMMMMMMMMM \r\n" + 
    			"  ;i:ZBWBWBBMMMMMMMMBWBWBWWZ:iiiiiiiiiiii                                                                    iiiiiiiiiii:i7WBWBWBB@MMMMMMMWWBWB@B;:;. \r\n" + 
    			"            :iiiii;:                                                                                                               i;iii;i            \r\n" + 
    			"                                                                                                                                                      \r\n" + 
    			"                                                                                   ");
    }
    
    public static void getBossLoss() {
    	System.out.println("                                                           MMMW                        MMM8                                                           \r\n" + 
    			"                                                         7MMMBWM:                    XMZMMMMi                                                         \r\n" + 
    			"                                                       iMMMM,  X,                    r:  XMMMW                                                        \r\n" + 
    			"                                                      :MMMM                                MMMM                                                       \r\n" + 
    			"                                                      ,MMMMa                              0MMMM                                                       \r\n" + 
    			"                                                       ZMMMMM7                          ZMMMMM7                                                       \r\n" + 
    			"                                                        BMMMMM@8,         MZ         rZMMMMMMX                                                        \r\n" + 
    			"                                                  Xai    ZMMMMMMM8,   W, ;MM  Sa  .:MMMMMMMMX  :ZX                                                    \r\n" + 
    			"                                                  BM7Z82. :MMMMMMMMaX,XM7XMM,WMi;X8MMMMMMMM;iZZXMW                                                    \r\n" + 
    			"                         0.                       2M   ,2X  XMMMMaX7i  @MM :MMX  rXS8MMMMW;;:   Za                        B                           \r\n" + 
    			"                         MMaWMr:,:,:,,             82         0Sa;    Sarri;;Xar    XSZS       aZ                    .8B0MM                           \r\n" + 
    			"                         iM rZaMMMMMMMMMMMM8080Z    ,;  2;     rZ   :MMMMMMMMMMMM    0.       ZX:.. 888ZZMMMMMMMMMMMMMMMMM,                           \r\n" + 
    			"                          ZX          7BMMMMMMMMMMMMZZ rM2     M:   MMMMM@MMBMMMMM   ZZ MZ 20,  i7S2MMMMMMMMMMMMMMMMMr:ZSX                            \r\n" + 
    			"                          7M              ;SMMMMMMMMMMMMM;    @X   MMB0rr0MMZiX0WMW   B77M0i.   8WMMMMMMMMMMMMMMMMM2  :MX                             \r\n" + 
    			"                           i@;               .;MMMMMMMMMM:   BZ   iMZr8MBSMMrMMZiMM    B;MZ    iMMMMMMMMMMMMMMMM;.   iM:                              \r\n" + 
    			"                            r07                 ;XMMMMMMM@ ,a,  X .MMSi. iMM  ,;ZMM .7  7M      rMMMMMMMMMM0;;      BMM                               \r\n" + 
    			"                              Sa:.                 0MMMMMMirZ;;2M  ;MM0ZaMMM@aaMMM  iM7irM,      .WMMWir         XWM2:@                               \r\n" + 
    			"                               rM207;               :7MMMZ  .WBMM   ,7r707B070;rX   rMM8WZ                   .BMM@MX  M                               \r\n" + 
    			"                               ;@  XaSi;;                   .MMM       SZZ2aZZi      XMMMX;::          ..iMMMMBS  8S :M                               \r\n" + 
    			"                               ;M    SMSaZ00a;r         XaW  MM:      MMMM@@MMM0      ZMMS0a@MW.,.8@@BMMMMZa;     Za .M                               \r\n" + 
    			"                               rM    M     .ia20Z.    70; M. rM. ;:7  ;MMM8BMMW.  r:i SMM  S;XMMMMMMM@M            M: M                               \r\n" + 
    			"                               iM   WX          7M  :82   XW  MMMBZ0Z;  riX7;r  XZBSM@MMX   rX,      i0            M: M                               \r\n" + 
    			"                               W;  :M           .M ZB,     Za  MMMMM2ia2r    X2Z.MMMMMM2      2Z     XW            0r a2                              \r\n" + 
    			"                              ,M   Mi           7@ :        ::  B@MZ    :ZSSa    ,@MM8         8Z    XM             @ iM                              \r\n" + 
    			"                               M  S0           aMM .           ;i,;7 :    ;,      :2,      ,,  a@    Z8         .8MMM ;M                              \r\n" + 
    			"                              ;@  Mi            XZMMM7;ii,i .@MMBa8827W    ,i .802S        .MM@;    iM        MMMMMMM :W                              \r\n" + 
    			"                              M  0S                 72SSZMX MMMMMMM2:SMB2 .BXS,      ,      MMX     Br        WMMMMMM  Z8                             \r\n" + 
    			"                              M  Z8                     7i MMMMMMMM     .0;.B;27      80. ;MM7 ,   .M         @MMMMMM  80                             \r\n" + 
    			"                             Z2  2MWZ0X                 :.BMMMMMMM,iXZaaS0; aM BZ    iMMMMM0  S;   .M        0MMMMMMM  ,B;                            \r\n" + 
    			"                             M:  2MMMMMMMM0Z8Z8Z888Z8Z8ZM:SMMMMMMM       a8  ; Z8iZ0MMMM@7S .ZX,,   M.       8MMMMMMM   @2                            \r\n" + 
    			"                             Mi   MMMMMMMMMMMMMMMMMMMMMMMM 0MMMMMMir7SXXaW.    WX rMMMX XX;XXXX2Za  iM       BMMMMMM    @S                            \r\n" + 
    			"                             M:   SMMMMMMMMMMMMMMMMMMMMMMMa MMMMM;: .:ii08   r8i 7S;. r7         ;M  M        MMMMMM    02                            \r\n" + 
    			"                            @S     BMMMMMMMMMMMMMMMMM7ii     ;ZMa77WBWMai rB87       8S           rW X@       BMMMMM     M;                           \r\n" + 
    			"                            MS      iXMMMMMMMMM7;;.     0B;i.     7r7r       .  ;araMW             M iM       MMMMMM.    Mi                           \r\n" + 
    			"                           70.                         XZira288, i.          @BZaZ;XW:             M  2W      :MMMMM,    rB                           \r\n" + 
    			"                           00                        ;07      .  2S          i.  .,,M              M   0Z      iMMMa      M                           \r\n" + 
    			"                           02                      :Za                         ZMM.Z:              Mi2  WX      MMM,      M;                          \r\n" + 
    			"                          SW                      2Z:                       MMMMMM.M               M7@   M.     MMMi      .M                          \r\n" + 
    			"                          XM                    rZ:     iZ:                 MMMMMM @ BZ           2X:Mi  M      SMMr      .M                          \r\n" + 
    			"                         .Mi                   .M0aa27SMM:       .Ba        MMMMMM.M aZ           MiMMMi X       :2        Z0                         \r\n" + 
    			"                      .rr07                          ZMW           iB2      MMMMMM ZMBS           W:;XX. MMZZ8ZZS8Mr        82;r                      \r\n" + 
    			"               ;r;rZB0Z22                          ;MMMM7           WMB     MMMMM   8MX          Wa     @MMMMMMMMMMMWa       ia200BSr;r:              \r\n" + 
    			"     ,;;;;;a0BZa2aS. .                             8MMMM.           B7;W    MMMMa @  ,B:        ;@      MMMMMMMMMMMMMMMWS          ;2a2Z808X;;;r;     \r\n" + 
    			" .;80a2S22a:                                       ZMMM2            WX a0   MMMS B    MX       iM.     0Z:XMMMMMMMMMM@MMSXZS:i;            7aS2S2Z02:,\r\n" + 
    			"MMZ                                           :r  SMMMMM.           W7.iZa  MM.iXri:  0.       ,S  .i.ZZ   2MMMW.  .X7:Z72ZSZrr@,                  :@M\r\n" + 
    			"XrXZ887;:                   ,rr;r;;;;;S0080800ZX MMMMX@MMr.       ;BZ XX i8rr:Si ;a7 BM   i00Z8ZZZ:7r 8Z  ,ZMMM:      i,0: iSS.Mi r;;;r;;;;i;i;i;282X \r\n" + 
    			"      7aa00000000B008080000BZa2a2a2a2Zr    . .  .MMMMM MM@M@Z00000ar       XaX      ;MMMMMMMMMMMMMMMX XBiXM   iSZ08Xii..BZ,.2MX. .aa222a2a2a222a2,    \r\n" + 
    			"            .           .                          r7i rX i.    .                    .;MMMMMXWMMMSWMMM :aX         raS22,i22r                         \r\n" + 
    			"                                                                                        BWB@ XWWW iMW:                                                ");
    }
    
    public static void getGameOver() {
    	System.out.print("                                                                                                                                                      \r\n" + 
    			"                                                                                                                                                      \r\n" + 
    			"                                                                                                                                                      \r\n" + 
    			"                                                                                                                                                      \r\n" + 
    			"                                                                                                                                                      \r\n" + 
    			"                             80Z8Z0808080800W8     :0Z8Z88080Z8Z80:     808Z8Z8808088Z8Z8Z88088Z8Z00        B88Z8808080808BBS                         \r\n" + 
    			"                           22MMMMMMMMMMMMMMMMM   :2MMMMMMMMMMMMMMM@a.   MMMMMMMMMMMMMMMMMMMMMMMMMMMM8Z    a0MMMMMMMMMMMMMMMMM                         \r\n" + 
    			"                           MMMMMMMMSZZZZZZZZ8Z   XMMMMMMMaa2ZMMMMMMMX   MMMMMMM@aa2@MMMMMMMSZ2BMMMMMMM    MMMMMMM8aaZaZZ8Z80X                         \r\n" + 
    			"                           MMMMMMMX              7MMMMMMM    MMMMMMM;   MMMMMMMS   aMMMMMM@   .MMMMMMM    MMMMMMM                                     \r\n" + 
    			"                           MMMMMMMZ  .      ..   ;MMMMMMM   .MMMMMMM;   MMMMMMMZ   ZMMMMMMM   ;MMMMMMM    MMMMMMM;    ,                               \r\n" + 
    			"                           MMMMMMMa 8MMMMMMMMM   rMMMMMMMMMMMMMMMMMMi   MMMMMMMZ   0MMMMMMM   ;MMMMMMM    MMMMMMMMMMMMM                               \r\n" + 
    			"                           MMMMMMMZ aMMMMMMMMM   ;MMMMMMMMMMMMMMMMMM;   MMMMMMMZ   8MMMMMMM   rMMMMMMM    MMMMMMMMMMMMM                               \r\n" + 
    			"                           MMMMMMMa   aMMMMMMM   rMMMMMMM    MMMMMMMi   MMMMMMMZ   0MMMMMMM   ;MMMMMMM    MMMMMMM,                                    \r\n" + 
    			"                           MMMMMMM2   2MMMMMMM   ;MMMMMMM    MMMMMMM;   MMMMMMMZ   8MMMMMMM   rMMMMMMM    MMMMMMM                                     \r\n" + 
    			"                           MMMMMMMMMMMMMMMMMMM   rMMMMMMM    MMMMMMMi   MMMMMMM8   BMMMMMMM   rMMMMMMM   .MMMMMMMMMMMMMMMMMMZ                         \r\n" + 
    			"                           ,iMMMMMMMMMMMMMMMMM   XMMMMMMM   .MMMMMMMX   MMMMMMMW   @MMMMMMM   SMMMMMMM    iXMMMMMMMMMMMMMMMMM                         \r\n" + 
    			"                             r;r;;i;i;i;i;i;;;   .7r;;i;r    X;ri;i7    ;7;r;;r:   :;;iiir;    7;;i;;7      ;;iii;;;;r;r;rrXi                         \r\n" + 
    			"                                                                                                                                                      \r\n" + 
    			"                                 irr;r;r;r;r;rrX      X7;rr7X    7rr;rrX:     i7r7r7;r;7;7r77XX    Xrr;7r7r7rr;r;rr:                                  \r\n" + 
    			"                               ,iMMMMMMMMMMMMMMMXi   .MMMMMMMr   MMMMMMMW   ::MMMMMMMMMMMMMMMMM   ,MMMMMMMMMMMMMMMMMi.                                \r\n" + 
    			"                               MMMMMMMM@@@MMMMMMMM    MMMMMMMi   MMMMMMMa   MMMMMMMMWMMMMMMMMMM    MMMMMMMM@@WMMMMMMMB                                \r\n" + 
    			"                               BMMMMMMW   iMMMMMMM    MMMMMMM:   MMMMMMMZ   BMMMMMMB               MMMMMMM    MMMMMMM8                                \r\n" + 
    			"                               BMMMMMM@   ;MMMMMMM    MMMMMMMi   MMMMMMMa   0MMMMMMW               MMMMMMM.   MMMMMMM8                                \r\n" + 
    			"                               0MMMMMMM   7MMMMMMM    MMMMMMM:   MMMMMMMZ   BMMMMMMMMMMMM2         MMMMMMMMMMMMMMMMZ                                  \r\n" + 
    			"                               BMMMMMMM   rMMMMMMM    MMMMMMMi   MMMMMMMa   0MMMMMMMMMMMMZ         MMMMMMMMMMMMMMMMZ                                  \r\n" + 
    			"                               0MMMMMMM   rMMMMMMM    MMMMMMM:   MMMMMMMZ   BMMMMMMW    .          MMMMMMM;   MMMMMMM2                                \r\n" + 
    			"                               BMMMMMMW   ,MMMMMMM    MMMMMMM    MMMMMMMZ   0MMMMMMB               MMMMMMM    MMMMMMM0                                \r\n" + 
    			"                               MMMMMMMMa8ZWMMMMMMM    MMMMMMM0ZZZMMMMMMMB   MMMMMMMMaZ8Z080800W    MMMMMMMi   MMMMMMMZ                                \r\n" + 
    			"                               rXMMMMMMMMMMMMMMMZ2   ,MMMMMMMMMMMMMMMMMSi   rSMMMMMMMMMMMMMMMMM.  .MMMMMMMr   MMMMMMMB                                \r\n" + 
    			"                                 X8aZZZZ8ZZaZZZ8      BZZaZaZZ8ZZZZZZZ7       SZZaZZZZ8Z8Z8Z88B    08ZZa80,   8ZZaZZ07                                \r\n" + 
    			"                                                                                                                                                      \r\n" + 
    			"                                                                                                                                                      \r\n" + 
    			"                                                                                                                                                      \r\n" + 
    			"                                                                                                                                                      ");
    }
    
    public static void main (String args[]) {
    	getBossFight();
    	getBoss();
    	getBossLoss();
    	getGameOver();
    }
    
}
