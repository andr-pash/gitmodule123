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

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import com.apiomat.nativemodule.*;


import com.apiomat.nativemodule.basics.*;
import com.apiomat.nativemodule.AuthState;
/**
* Generated class for your TestResourceAccess data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@SuppressWarnings( "unused" )
@Model( moduleName = "GitTest123",
    hooksClassNameTransient = "com.apiomat.nativemodule.gittest123.TestResourceAccessHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.gittest123.TestResourceAccessHooksNonTransient", 
            isTransient = false,     requiredUserRoleCreate=UserRole.User, requiredUserRoleRead=UserRole.User,
    requiredUserRoleWrite=UserRole.Owner, restrictResourceAccess=true,
    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={})
public class TestResourceAccess extends AbstractClientDataModel implements IModel<TestResourceAccess>
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "GitTest123";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "TestResourceAccess";

    /** class specific attributes */
    @StaticData( type = com.apiomat.nativemodule.StaticData.Type.File )
    private String fileURL;
    @StaticData( type = com.apiomat.nativemodule.StaticData.Type.Image )
    private String imageURL;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public TestResourceAccess ()
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

    public String getFileURL( )
    {
        String url;
        url = this.fileURL;
        return url;
    }

    public byte[] loadFile( )
    {
        String resUrl = getFileURL()+".img";
        return loadResource(resUrl);
    }

    public String getFileURL( String apiKey, String system )
    {
        final String additionalParameters = ".img?apiKey=" + apiKey + "&system=" + system;
        return getFileURL( ) + additionalParameters;
    }

    public byte[] loadFile( String apiKey, String system )
    {
        final String resUrl = getFileURL( apiKey, system );
        return loadResource(resUrl);
    }

    public void setFileURL( String url ) 
    {
        this.fileURL = url;
    }

    public String postFile( byte[] data , String fileName, String format )
    {
        String url = saveResource( data, false, fileName, format );
        setFileURL( url );
        return url;
    }

    public String getImageURL( )
    {
        String url;
        url = this.imageURL;
        return url;
    }

    public byte[] loadImage( )
    {
        String resUrl = getImageURL()+".img";
        return loadResource(resUrl);
    }

    public String getImageURL( String apiKey, String system, int width, int height, 
        String backgroundColorAsHex, Double alpha, String format )
    {
        final StringBuilder additionalParameters = new StringBuilder();
        additionalParameters.append( ".img?apiKey=" );
        additionalParameters.append( apiKey );
        additionalParameters.append( "&system=" );
        additionalParameters.append( system );
        additionalParameters.append( "&width=" );
        additionalParameters.append( width );
        additionalParameters.append( "&height=" );
        additionalParameters.append( height );
        
        if(backgroundColorAsHex != null) 
        {
            additionalParameters.append( "&bgcolor=" );
            additionalParameters.append( backgroundColorAsHex );
        }
        if(alpha != null)
        {
            additionalParameters.append( "&alpha=" );
            additionalParameters.append( alpha );
        }
        if(format != null)
        {
            additionalParameters.append( "&format=" );
            additionalParameters.append( format );
        }
        return getImageURL( ) + additionalParameters;
    }

    public byte[] loadImage( String apiKey, String system, int width, int height, 
        String backgroundColorAsHex, Double alpha, String format )
    {
        final String resUrl = getImageURL( apiKey, system, width, height, 
            backgroundColorAsHex, alpha, format );
        return loadResource(resUrl);
    }

    public void setImageURL( String url ) 
    {
        this.imageURL = url;
    }

    public String postImage( byte[] data , String fileName, String format )
    {
        String url = saveResource( data, true, fileName, format );
        setImageURL( url );
        return url;
    }

}
