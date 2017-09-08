/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-doc-viewer project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.iron.widget.event.IronDocViewerComponentSelectedEvent;
import com.vaadin.polymer.iron.widget.event.IronDocViewerComponentSelectedEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Renders documentation describing an element’s API.</p>
 * <p><code>iron-doc-viewer</code> renders element and behavior descriptions as extracted by<br><a href="https://github.com/PolymerLabs/hydrolysis">Hydrolysis</a>. You can provide them<br>either via binding…</p>
 * <pre><code>&lt;iron-doc-viewer descriptor=&quot;{{elementDescriptor}}&quot;&gt;&lt;/iron-doc-viewer&gt;
 * 
 * 
 * </code></pre><p>…or by placing the element descriptor in JSON as the text content of an<br><code>iron-doc-viewer</code>:</p>
 * <pre><code>&lt;iron-doc-viewer&gt;
 *   {
 *     &quot;is&quot;: &quot;awesome-sauce&quot;,
 *     &quot;properties&quot;: [
 *       {&quot;name&quot;: &quot;isAwesome&quot;, &quot;type&quot;: &quot;boolean&quot;, &quot;desc&quot;: &quot;Is it awesome?&quot;},
 *     ]
 *   }
 * &lt;/iron-doc-viewer&gt;
 * 
 * 
 * </code></pre><p>However, be aware that due to current limitations in Polymer 0.8, <em>changes</em> to<br>the text content will not be respected, only the initial value will be loaded.<br>If you wish to update the documented element, please set it via the <code>descriptor</code><br>property.</p>
 */
public class IronDocViewer extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronDocViewer() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronDocViewer(String html) {
        super(IronDocViewerElement.TAG, IronDocViewerElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronDocViewerElement getPolymerElement() {
        return (IronDocViewerElement) getElement();
    }


    /**
     * <p>The <a href="https://github.com/PolymerLabs/hydrolysis">Hydrolysis</a>-generated<br>element descriptor to display details for.</p>
     * <p>Alternatively, the element descriptor can be provided as JSON via the text content<br>of this element.</p>
     *
     * JavaScript Info:
     * @property descriptor
     * @type hydrolysis.ElementDescriptor
     * 
     */
    public JavaScriptObject getDescriptor() {
        return getPolymerElement().getDescriptor();
    }
    /**
     * <p>The <a href="https://github.com/PolymerLabs/hydrolysis">Hydrolysis</a>-generated<br>element descriptor to display details for.</p>
     * <p>Alternatively, the element descriptor can be provided as JSON via the text content<br>of this element.</p>
     *
     * JavaScript Info:
     * @property descriptor
     * @type hydrolysis.ElementDescriptor
     * 
     */
    public void setDescriptor(JavaScriptObject value) {
        getPolymerElement().setDescriptor(value);
    }

    /**
     * <p>Prefix for fragment identifiers used in anchors.<br>For static routing <code>iron-component-page</code> can<br>set this to a string identifying the current component.</p>
     *
     * JavaScript Info:
     * @property prefix
     * @type String
     * 
     */
    public String getPrefix() {
        return getPolymerElement().getPrefix();
    }
    /**
     * <p>Prefix for fragment identifiers used in anchors.<br>For static routing <code>iron-component-page</code> can<br>set this to a string identifying the current component.</p>
     *
     * JavaScript Info:
     * @property prefix
     * @type String
     * 
     */
    public void setPrefix(String value) {
        getPolymerElement().setPrefix(value);
    }


    // Needed in UIBinder
    /**
     * <p>The <a href="https://github.com/PolymerLabs/hydrolysis">Hydrolysis</a>-generated<br>element descriptor to display details for.</p>
     * <p>Alternatively, the element descriptor can be provided as JSON via the text content<br>of this element.</p>
     *
     * JavaScript Info:
     * @attribute descriptor
     * 
     */
    public void setDescriptor(String value) {
        Polymer.property(this.getPolymerElement(), "descriptor", value);
    }


    /**
     * <p>Scrolls to the currently selected anchor, as identified<br>by the URL hash. Whichever element or script is in charge<br>of routing should call this method on initial page load and<br>on hashchange events.</p>
     *
     * JavaScript Info:
     * @method scrollToAnchor
     * @param {} hash  
     * 
     * 
     */
    public void scrollToAnchor(Object hash) {
        getPolymerElement().scrollToAnchor(hash);
    }


    /**
     * <p>Broadcast when another component is clicked on</p>
     *
     * JavaScript Info:
     * @event iron-doc-viewer-component-selected
     */
    public HandlerRegistration addIronDocViewerComponentSelectedHandler(IronDocViewerComponentSelectedEventHandler handler) {
        return addDomHandler(handler, IronDocViewerComponentSelectedEvent.TYPE);
    }

}
