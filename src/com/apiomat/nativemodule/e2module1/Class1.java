/*
 * Copyright (c) 2011 - 2017, Apinauten GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.e2module1;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import com.apiomat.nativemodule.*;

import com.apiomat.nativemodule.e2module2.Class2;

import com.apiomat.nativemodule.basics.*;
import com.apiomat.nativemodule.e2module2.*;
import com.apiomat.nativemodule.AuthState;
/**
* Generated class for your Class1 data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@SuppressWarnings( "unused" )
@Model( moduleName = "E2Module1",
    hooksClassNameTransient = "com.apiomat.nativemodule.e2module1.Class1HooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.e2module1.Class1HooksNonTransient", 
            isTransient = false,     requiredUserRoleCreate=UserRole.User, requiredUserRoleRead=UserRole.User,
    requiredUserRoleWrite=UserRole.Owner, restrictResourceAccess=false,
    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={})
public class Class1 extends Class2
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "E2Module1";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "Class1";

    /** class specific attributes */
    private com.apiomat.nativemodule.e2module2.Class2 class2Attribute = null;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public Class1 ()
    {}

    /**
     * Returns the name of the module where this class belongs to
     */
    @Override
    public String getModuleName( )
    {
        return MODULE_NAME;
    }

    /**
     * Returns the name of the model
     */
    @Override
    public String getModelName( )
    {
        return MODEL_NAME;
    }

    public com.apiomat.nativemodule.e2module2.Class2 getClass2Attribute()
    { 
        if(this.class2Attribute == null)
        {
            /* do this by reflection to be backward compartible */
            try
            {
                Method m = AbstractClientDataModel.class.getMethod( "loadReference", String.class,  Class.class );
                this.class2Attribute =  ( com.apiomat.nativemodule.e2module2.Class2 ) m.invoke( this, "class2Attribute", com.apiomat.nativemodule.e2module2.Class2.class );
            }
            catch ( NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e )
            {
                 //silently ignored
            }
        }   
        return this.class2Attribute;
    }

    public void postClass2Attribute( final com.apiomat.nativemodule.e2module2.Class2 refData )
    {
        addReference( "class2Attribute", refData );
        this.class2Attribute = refData;
    }

    public void removeClass2Attribute( final com.apiomat.nativemodule.e2module2.Class2 refData )
    {
        removeReference( "class2Attribute", refData );
        this.class2Attribute = null;
    }

}
