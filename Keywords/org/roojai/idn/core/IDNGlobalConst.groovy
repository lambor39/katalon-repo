package org.roojai.idn.core
public class IDNGlobalConst{
	public static final Boolean DEFAULT_EMAIL_ONLY_ME=false
	public static final Boolean DEFAULT_EMAIL_STOP_SEND=false
	public static final String DEFAULT_EMAIL_TO_DEPT_IT='srinda.tar@roojai.com,christina.per@roojai.com,mehdi.aid@roojai.com,supaporn.hom@roojai.com,patchek.ran@roojai.com,anoop@roojai.com,chatchai.bun@roojai.com,kavitha.sri@roojai.com,sorawit.sir@roojai.com,pmt-it-qa@roojai.com,ampon.yan@roojai.com,anchaleephorn.non@roojai.com,aonnitcha.yan@roojai.com,ariya.rat@roojai.com,atipong.pre@roojai.com,aungmyo.htw@roojai.com,chalermsuk.sir@roojai.com,kayzin.han@roojai.com,khunanyu.cha@roojai.com,napasin.phe@roojai.com,nuttaporn.sam@roojai.com,pannawit.khe@roojai.com,phudchara.pho@roojai.com,phyoei.san@roojai.com,ratchano@roojai.com,sarin@roojai.com,savitree.boo@roojai.com,siripoon.yim@roojai.com,suchawadee@roojai.com,tanit.sri@roojai.com,thanaphon.cha@roojai.com,unchana.dak@roojai.com,worrasiri.nim@roojai.com'
	public static final String DEFAULT_EMAIL_TO_PRODUCT_IT=this.DEFAULT_EMAIL_TO_DEPT_IT
	public static final String DEFAULT_EMAIL_TO_PRODUCT_KUMKA=this.DEFAULT_EMAIL_TO_DEPT_IT+',chalit.bor@roojai.com,machima.ler@mrkumka.com,moemoe.myi@mrkumka.com,sathaphon.phi@mrkumka.com,veerayut.jeh@mrkumka.com,anucha.has@mrkumka.com'
	public static final String DEFAULT_EMAIL_TO_PRODUCT_MOTOR=this.DEFAULT_EMAIL_TO_DEPT_IT+',suttiwas@roojai.com'
	public static final String DEFAULT_EMAIL_TO_PRODUCT_PROTECTION=this.DEFAULT_EMAIL_TO_DEPT_IT
	public static final String DEFAULT_EMAIL_TO_ME='chatchai.bun@roojai.com,kavitha.sri@roojai.com,sorawit.sir@roojai.com'
	public static final String DEFAULT_EMAIL_TEMPLATE_BODY_REPORT='''<p></p>
<p></p>
<center>
<table style="border: 0px; width: 60%; background: #eee;">
<tbody>
<tr>
<td style="text-align: center; padding: 20px 0px;"><img style="margin: auto;" src="https://www.roojai.com/wp-content/themes/roojai-kit-3/assets/img/roojai-logo.svg" width="100" /></td>
</tr>
<tr>
<td style='border:solid #EEEEEE 1.0pt;border-bottom:none;
mso-border-top-alt:solid #EEEEEE .75pt;mso-border-left-alt:
solid #EEEEEE .75pt;mso-border-right-alt:solid #EEEEEE .75pt;
background:#003B71;padding:7.5pt 7.5pt 7.5pt 7.5pt'>
<p class=MsoNormal align=center style='text-align:center'><span
style='font-size:12.0pt;font-family:"Arial",sans-serif;
mso-fareast-font-family:"Times New Roman"'>
<link rel=icon
href="https://www.Roojai.com/wp-content/uploads/2018/03/favicon-32x32.png"
sizes=32x32>
<img width=238 height=55 id="_x0000_i1026"
src="https://www.roojai.com/EmailTemplate/v1/Common/All/roojia-insurance-w.png"><o:p></o:p></span></p>
</td>
</tr>
<tr>
<td style="height: 5px; line-height: 5px;">&nbsp;</td>
</tr>
<tr>
<td style="background: #fff; text-align: left; padding: 10px 20px;">
<table style="border: 0px; width: 100%; background: #fff;">
<tbody>
<tr>
<td style="font-weight: 400; padding-bottom: 10px; font-size: 14px;">Dear Team<span style="color: #003b71;">,</span></td>
</tr>
<tr>
<td style="padding-bottom: 20px;">
<p>${product}: Automation report on <span style="color: #ff5011; line-height: 1.4; font-size: 14px;">${datetime}&nbsp;(Thailand time)</span>.</p>
</td>
</tr>
<tr>
<td style="padding: 10px; background: #eee;"><b>Total : ${total} cases</b></td>
</tr>
<tr>
<td>
<table style="border: 0px; width: 100%; background: #fff; border-bottom: 1px solid #ddd;">
<tbody>
<tr>
<td style="border: 0px; width: 30%; padding: 10px;"><b style="color: green;">Success : ${success}</b></td>
<td style="border: 0px; width: 30%; padding: 10px;"><b style="color: red;">Fails : ${fails}</b></td>
<td style="border: 0px; width: 30%; padding: 10px;"><b style="color: red;">Errors : ${errors}</b></td>
</tr>
</tbody>
</table>
</td>
</tr>
<tr>
<td style="padding-top: 20px;">
<p>Click here for <a title="" href="https://testops.katalon.io/team/32764">Katalon TestOps Reports</a>.<br />Click here for <a title="" href="https://automation.lambdatest.com/archives">LambdaTest Reports and Videos</a>.</p>
</td>
</tr>
</tbody>
</table>
</td>
</tr>
<tr>
<td style="background: #dddddd; text-align: left; padding: 10px 20px;">
<table style="border: 0px; width: 100%; background: #dddddd; font-size: 13px;">
<tbody>
<tr>
<td style="padding-bottom: 10px;">Note:</td>
</tr>
<tr>
<td>
<ul style="font-size: 12px; line-height: 1.4; padding: 0 10px; margin: 0; color: #666666; text-align: left; padding-left: 20px; list-style-position: inside; list-style-type: disk;">
<li style="padding: 0; margin: 0; padding-left: 5px;">This e-mail is automatically generated &ndash; please do not reply.</li>
<li style="padding: 0; margin: 0; padding-left: 5px;">Do not share your account information with anyone.</li>
</ul>
</td>
</tr>
</tbody>
</table>
</td>
</tr>
<tr>
<td style="background: #eee; text-align: left; padding: 10px 20px;">
<table style="border: 0px; width: 100%; background: #eee; font-size: 12px;">
<tbody>
<tr>
<td style="text-align: right; width: 32%;"><img src="https://www.Roojai.com/EmailTemplate/v1/Common/en/answer-logo.png" width="80" /></td>
<td valign="middle" style="text-align: left; width: 68%;"><b style="font-weight: 400; font-size: 11px; color: #003b71;">Roojai.com always there when you need us. </b></td>
</tr>
<tr>
<td colspan="2" style="text-align: center; font-size: 11px; color: #aaa; padding: 5px;">2016 Roojai co.,ltd. ( registration no: 0205557039412 )</td>
</tr>
</tbody>
</table>
</td>
</tr>
<tr style='mso-yfti-irow:1;mso-yfti-lastrow:yes'>
<td width="100%" style='width:100.0%;border:solid #EEEEEE 1.0pt;
border-top:none;mso-border-left-alt:solid #EEEEEE .75pt;
mso-border-bottom-alt:solid #EEEEEE .75pt;mso-border-right-alt:
solid #EEEEEE .75pt;padding:0cm 0cm 0cm 0cm'>
<div align=center>
<table class=MsoNormalTable border=0 cellspacing=0
cellpadding=0 width="96%" style='width:96.0%;border-collapse:
collapse;mso-yfti-tbllook:1184'>
<tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes'>
<td width="50%" valign=top style='width:50.0%;padding:
.75pt .75pt .75pt .75pt'>
<table class=MsoNormalTable border=0 cellspacing=0
cellpadding=0 width="96%" style='width:96.0%;border-collapse:
collapse;mso-yfti-tbllook:1184'>
<tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes'>
<td style='padding:.75pt .75pt .75pt .75pt'>
<p class=MsoNormal style='mso-margin-top-alt:auto;
mso-margin-bottom-alt:auto'><span style='font-size:
7.5pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
"Times New Roman";color:#888888'>English contact center
<br>
</span><span style='font-size:10.5pt;font-family:"Helvetica",sans-serif;
mso-fareast-font-family:"Times New Roman";mso-bidi-font-family:
Arial;color:#888888'>02 582 8866</span><span
style='font-size:7.5pt;font-family:"Arial",sans-serif;
mso-fareast-font-family:"Times New Roman";color:#888888'>
<o:p></o:p></span></p>
</td>
</tr>
<tr style='mso-yfti-irow:1;mso-yfti-lastrow:yes'>
<td style='padding:.75pt .75pt .75pt .75pt'>
<p class=MsoNormal style='mso-margin-top-alt:auto;
mso-margin-bottom-alt:auto'><span style='font-size:
12.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
"Times New Roman"'><a
href="http://click.email.roojai.com/?qs=0a15867aff086776004ead8e1caeeb16db67b1f7b0f429d1731540957889359c092b194da53683ffe0150ea53109e68ba0a07d736826ccaf75d2bfd3104888ae"><span
style='text-decoration:none;text-underline:none'><img
border=0 width=25 id="_x0000_i1028"
src="https://www.roojai.com/EmailTemplate/v1/Common/All/fb-ico.png"></span></a>&nbsp;<a
href="http://click.email.roojai.com/?qs=3c30c6e3b00d12d4faf05e315a1e2bcba39d9931d76a516affb32eccf26aa2c45f36b475c6e8ebb3079c4689f388a084dcd5c4dbb8e48530770ea9cdf8b40ff9"><span
style='text-decoration:none;text-underline:none'><img
border=0 width=25 id="_x0000_i1029"
src="https://www.roojai.com/EmailTemplate/v1/Common/All/line-ico.png"></span></a>&nbsp;<a
href="http://click.email.roojai.com/?qs=3c30c6e3b00d12d40e63359257d374d612133bc414b0ab319838c6314e7576e1a2d5b58db6268b2a69e76cfae2a8b6376bb26958baaa9b9f3246d4103fe9a0aa"
target="_blank"><span style='text-decoration:none;
text-underline:none'> <img border=0 width=25
id="_x0000_i1030"
src="https://www.roojai.com/EmailTemplate/v1/Common/All/insta--ico.png"></span></a>&nbsp;<a
href="http://click.email.roojai.com/?qs=3c30c6e3b00d12d414b02e4217da893b0d43c32b507f1d142bb331a9f80d7cb2af7b5aa2ba3b96934ff658d8674717ba9cf0f4d336fa18c100e763cb6f11d371"
target="_blank"><span style='text-decoration:none;
text-underline:none'> <img border=0 width=25
id="_x0000_i1031"
src="https://www.roojai.com/EmailTemplate/v1/Common/All/youtube-ico.png"></span></a>&nbsp;<a
href="http://click.email.roojai.com/?qs=3c30c6e3b00d12d4b1a974740ae5737a4bf0010d91ae5163f892eac9406d93d3b182dd0f8afc102f8f2ad2cbef30a9d24762dde5801f14b8aecf369cd5494c6d"
target="_blank"><span style='text-decoration:none;
text-underline:none'><img border=0 width=25
id="_x0000_i1032"
src="https://www.roojai.com/EmailTemplate/v1/Common/All/twitter-ico.png"></span></a>&nbsp;<a
href="http://click.email.roojai.com/?qs=3c30c6e3b00d12d431d6c38f461a8b8b8ef0a2ab051f6b982404a117c190c7796e5cf0ff21e34cdc7fa0831f87eab3470055a9abd1d0ae5e3eae7c3ea46c9ef1"
target="_blank"><span style='text-decoration:none;
text-underline:none'><img border=0 width=25
id="_x0000_i1033"
src="https://www.roojai.com/EmailTemplate/v1/Common/All/linkin-ico.png"></span></a>
<o:p></o:p></span></p>
</td>
</tr>
</table>
</td>
<td width="50%" valign=top style='width:50.0%;padding:
.75pt .75pt .75pt .75pt'>
<table class=MsoNormalTable border=0 cellspacing=0
cellpadding=0 width="96%" style='width:96.0%;border-collapse:
collapse;mso-yfti-tbllook:1184'>
<tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes'>
<td style='padding:.75pt .75pt .75pt .75pt'>
<p class=MsoNormal style='mso-margin-top-alt:auto;
mso-margin-bottom-alt:auto'><span style='font-size:
7.5pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
"Times New Roman";color:#888888'>©2016 Roojai
copyright.<o:p></o:p></span></p>
</td>
</tr>
<tr style='mso-yfti-irow:1;mso-yfti-lastrow:yes'>
<td style='padding:.75pt .75pt .75pt .75pt'>
<p class=MsoNormal style='mso-margin-top-alt:auto;
mso-margin-bottom-alt:auto'><span style='font-size:
7.5pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
"Times New Roman";color:#888888'>Broker license no. </span><span
lang=TH style='font-size:7.5pt;font-family:"Angsana New",serif;
mso-ascii-font-family:Arial;mso-fareast-font-family:
"Times New Roman";mso-hansi-font-family:Arial;
color:#888888'>ว</span><span style='font-size:7.5pt;
font-family:"Arial",sans-serif;mso-fareast-font-family:
"Times New Roman";color:#888888'>00022/2558<br>
HarborMall, 11th Floor 4/222 M. 10 Sukhumvit road,
T.Tungsukla, A.Sri Racha, Chon Buri, 20230, Thailand <br>
<o:p></o:p></span></p>
</td>
</tr>
</table>
</td>
</tr>
<tr style='mso-yfti-irow:1;mso-yfti-lastrow:yes'>
<td style='padding:.75pt .75pt .75pt .75pt'>
<table class=MsoNormalTable border=0 cellspacing=0
cellpadding=0 width="100%" style='width:100.0%;
border-collapse:collapse;mso-yfti-tbllook:1184;
mso-padding-alt:0cm 0cm 0cm 0cm'>
<tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes;
mso-yfti-lastrow:yes;height:7.5pt'>
<td width="100%" style='width:100.0%;padding:0cm 0cm 0cm 0cm;
height:7.5pt'></td>
</tr>
</table>
</td>
<td style='padding:.75pt .75pt .75pt .75pt'></td>
</tr>
</tbody>
</table>
</center>
<p></p>
<p></p>'''
	public static final String DEFAULT_FACEBOOK_ACCOUNT='oohhooworld.th@outlook.com'
	public static final String DEFAULT_FACEBOOK_PASSWORD='Roojai@Facebook'
	public static final Boolean DEFAULT_SALESFORCE_ENDPOINT_IS_UAT=true
	public static final String DEFAULT_SALESFORCE_ENDPOINT_URL_UAT='https://teman--dev.sandbox.my.salesforce.com'
	public static final String DEFAULT_SALESFORCE_ENDPOINT_URL_PROD='https://roojai-idn.sandbox.my.salesforce.com'
	public static final String DEFAULT_SALESFORCE_CREDENTIAL_GRANT_TYPE='password'
	public static final String DEFAULT_SALESFORCE_CREDENTIAL_CLIENT_ID_UAT='3MVG9N6eDmZRVJOmH.1BTD1ujM4zVxWIBevn7AP0RYdXjG_6ROMRv3xZ_qRHtrIB42X5bj2Be5F9UzG1V.Vw3'
	public static final String DEFAULT_SALESFORCE_CREDENTIAL_CLIENT_ID_PROD='3MVG9N6eDmZRVJOmH.1BTD1ujM4zVxWIBevn7AP0RYdXjG_6ROMRv3xZ_qRHtrIB42X5bj2Be5F9UzG1V.Vw3'
	public static final String DEFAULT_SALESFORCE_CREDENTIAL_CLIENT_SECRET_UAT='3FCF2227C0479C54195F22394C12AC3ED2D229390F72BC76C3031A05A54A2031'
	public static final String DEFAULT_SALESFORCE_CREDENTIAL_CLIENT_SECRET_PROD='3FCF2227C0479C54195F22394C12AC3ED2D229390F72BC76C3031A05A54A2031'
	public static final String DEFAULT_SALESFORCE_CREDENTIAL_USER_NAME_UAT='chatchai.bun@roojai.co.id.dev'
	public static final String DEFAULT_SALESFORCE_CREDENTIAL_USER_NAME_PROD='chatchai.bun@roojai.co.id.dev'
	public static final String DEFAULT_SALESFORCE_CREDENTIAL_USER_PASSWORD_UAT='qs3aw4Uema'
	public static final String DEFAULT_SALESFORCE_CREDENTIAL_USER_PASSWORD_PROD='qs3aw4Uema'
	public static final Boolean DEFAULT_PRICING_API_SERVER_IS_UAT=true
	public static final String DEFAULT_PRICING_API_SERVER_REGISTER_CLIENT_URL_UAT='https://watergate.uat-roojai.co.id'
	public static final String DEFAULT_PRICING_API_SERVER_REGISTER_CLIENT_URL_PROD='https://watergate.roojai.co.id'
	public static final String DEFAULT_PRICING_API_SERVER_REGISTER_CLIENT_ENDPOINT_URL='/register-client'
	public static final Boolean DEFAULT_OMISE_ENDPOINT_IS_UAT=true
	public static final String DEFAULT_OMISE_ENDPOINT_URL_UAT='https://api.omise.co'
	public static final String DEFAULT_OMISE_ENDPOINT_URL_PROD='https://api.omise.co'
	public static final String DEFAULT_OMISE_CREDENTIAL_USER_NAME_UAT='skey_test_5927foqdhznrbptz6yh'
	public static final String DEFAULT_OMISE_CREDENTIAL_USER_NAME_PROD='skey_test_5927foqdhznrbptz6yh'
	public static final String DEFAULT_OMISE_CREDENTIAL_USER_PASSWORD_UAT=''
	public static final String DEFAULT_OMISE_CREDENTIAL_USER_PASSWORD_PROD=''
}