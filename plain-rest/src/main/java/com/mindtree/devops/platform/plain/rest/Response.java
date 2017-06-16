/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindtree.devops.platform.plain.rest;

/**
 *
 * @author M1011280
 */
public class Response {
    private String speech;

    private String source;

    private String displayText;

    private String data;

    private String[] contextOut;

    public String getSpeech ()
    {
        return speech;
    }

    public void setSpeech (String speech)
    {
        this.speech = speech;
    }

    public String getSource ()
    {
        return source;
    }

    public void setSource (String source)
    {
        this.source = source;
    }

    public String getDisplayText ()
    {
        return displayText;
    }

    public void setDisplayText (String displayText)
    {
        this.displayText = displayText;
    }

    public String getData ()
    {
        return data;
    }

    public void setData (String data)
    {
        this.data = data;
    }

    public String[] getContextOut ()
    {
        return contextOut;
    }

    public void setContextOut (String[] contextOut)
    {
        this.contextOut = contextOut;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [speech = "+speech+", source = "+source+", displayText = "+displayText+", data = "+data+", contextOut = "+contextOut+"]";
    }
}
