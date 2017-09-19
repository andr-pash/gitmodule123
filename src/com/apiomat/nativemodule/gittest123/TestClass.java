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
package com.apiomat.nativemodule.gittest123;


import com.apiomat.nativemodule.basics.*;
import com.apiomat.nativemodule.gittest123.*;
/**
* Generated class for your TestClass data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "GitTest123",
    hooksClassNameTransient = "com.apiomat.nativemodule.gittest123.TestClassHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.gittest123.TestClassHooksNonTransient", 
            isTransient = false,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.User, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,
    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={})
public class TestClass extends com.apiomat.nativemodule.AbstractClientDataModel implements com.apiomat.nativemodule.IModel<com.apiomat.nativemodule.gittest123.TestClass>
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "GitTest123";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "TestClass";

    /** class specific attributes */
    private String content = null;
    private com.apiomat.nativemodule.gittest123.TestResourceAccess relation = null;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public TestClass ()
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

    public String getContent()
    {
         return this.content;
    }

    public void setContent( String arg )
    {
        this.content = arg;
    }

    public com.apiomat.nativemodule.gittest123.TestResourceAccess getRelation()
    { 
        if(this.relation == null)
        {
            /* do this by reflection to be backward compartible */
            try
            {
                java.lang.reflect.Method m = com.apiomat.nativemodule.AbstractClientDataModel.class.getMethod( "loadReference", String.class,  Class.class );
                this.relation =  ( com.apiomat.nativemodule.gittest123.TestResourceAccess ) m.invoke( this, "relation", com.apiomat.nativemodule.gittest123.TestResourceAccess.class );
            }
            catch ( java.lang.NoSuchMethodException | java.lang.SecurityException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e )
            {
                 //silently ignored
            }
        }   
        return this.relation;
    }

    public void postRelation( final com.apiomat.nativemodule.gittest123.TestResourceAccess refData )
    {
        addReference( "relation", refData );
        this.relation = refData;
    }

    public void removeRelation( final com.apiomat.nativemodule.gittest123.TestResourceAccess refData )
    {
        removeReference( "relation", refData );
        this.relation = null;
    }

}
