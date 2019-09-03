<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>My1stAM</className>
    <objects>
        <object type="Button" technology="Web">
            <name>check_out_btn</name>
            <codeName>CheckOutBtnButton</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="ButtonType" type="string" isRegExp="false">submit</property>
                    <property name="Name" type="string" isRegExp="true">CHECKOUT \(\$\d.*\)</property>
                    <property name="TagName" type="string" isRegExp="false">BUTTON</property>
                </properties>
            </identification>
        </object>
        <object type="EditField" technology="Web">
            <name>passwordInOrderPayment</name>
            <codeName>PasswordInOrderPaymentEditField</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="Name" type="string" isRegExp="false">passwordInOrderPayment</property>
                    <property name="TagName" type="string" isRegExp="false">INPUT</property>
                    <property name="Type" type="string" isRegExp="false">password</property>
                </properties>
            </identification>
        </object>
        <object type="Button" technology="Web">
            <name>login_btnundefined</name>
            <codeName>LoginBtnundefinedButton</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="ButtonType" type="string" isRegExp="false">button</property>
                    <property name="Name" type="string" isRegExp="false">LOGIN</property>
                    <property name="TagName" type="string" isRegExp="false">BUTTON</property>
                </properties>
            </identification>
        </object>
        <object type="WebElement" technology="Web">
            <name>REMOVE</name>
            <codeName>REMOVEWebElement</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="InnerText" type="string" isRegExp="false">REMOVE</property>
                    <property name="TagName" type="string" isRegExp="false">A</property>
                </properties>
            </identification>
        </object>
        <object type="EditField" technology="Web">
            <name>usernameInOrderPayment</name>
            <codeName>UsernameInOrderPaymentEditField</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="Name" type="string" isRegExp="false">usernameInOrderPayment</property>
                    <property name="TagName" type="string" isRegExp="false">INPUT</property>
                    <property name="Type" type="string" isRegExp="false">text</property>
                </properties>
            </identification>
        </object>
    </objects>
</applicationModel>
