//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.06.14 时间 01:09:07 PM CST 
//


package net.opengis.pidflo._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_1_1.AbstractSolidType;
import net.opengis.gml.v_3_1_1.LengthType;
import net.opengis.gml.v_3_1_1.SurfacePropertyType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.MergeFrom2;
import org.jvnet.jaxb2_commons.lang.MergeStrategy2;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>PrismType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PrismType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractSolidType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="base" type="{http://www.opengis.net/gml}SurfacePropertyType"/&gt;
 *         &lt;element name="height" type="{http://www.opengis.net/gml}LengthType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrismType", propOrder = {
    "base",
    "height"
})
public class PrismType
    extends AbstractSolidType
    implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(required = true)
    protected SurfacePropertyType base;
    @XmlElement(required = true)
    protected LengthType height;

    /**
     * 获取base属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SurfacePropertyType }
     *     
     */
    public SurfacePropertyType getBase() {
        return base;
    }

    /**
     * 设置base属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SurfacePropertyType }
     *     
     */
    public void setBase(SurfacePropertyType value) {
        this.base = value;
    }

    public boolean isSetBase() {
        return (this.base!= null);
    }

    /**
     * 获取height属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getHeight() {
        return height;
    }

    /**
     * 设置height属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setHeight(LengthType value) {
        this.height = value;
    }

    public boolean isSetHeight() {
        return (this.height!= null);
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            SurfacePropertyType theBase;
            theBase = this.getBase();
            strategy.appendField(locator, this, "base", buffer, theBase, this.isSetBase());
        }
        {
            LengthType theHeight;
            theHeight = this.getHeight();
            strategy.appendField(locator, this, "height", buffer, theHeight, this.isSetHeight());
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PrismType that = ((PrismType) object);
        {
            SurfacePropertyType lhsBase;
            lhsBase = this.getBase();
            SurfacePropertyType rhsBase;
            rhsBase = that.getBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "base", lhsBase), LocatorUtils.property(thatLocator, "base", rhsBase), lhsBase, rhsBase, this.isSetBase(), that.isSetBase())) {
                return false;
            }
        }
        {
            LengthType lhsHeight;
            lhsHeight = this.getHeight();
            LengthType rhsHeight;
            rhsHeight = that.getHeight();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "height", lhsHeight), LocatorUtils.property(thatLocator, "height", rhsHeight), lhsHeight, rhsHeight, this.isSetHeight(), that.isSetHeight())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            SurfacePropertyType theBase;
            theBase = this.getBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "base", theBase), currentHashCode, theBase, this.isSetBase());
        }
        {
            LengthType theHeight;
            theHeight = this.getHeight();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "height", theHeight), currentHashCode, theHeight, this.isSetHeight());
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof PrismType) {
            final PrismType copy = ((PrismType) draftCopy);
            {
                Boolean baseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetBase());
                if (baseShouldBeCopiedAndSet == Boolean.TRUE) {
                    SurfacePropertyType sourceBase;
                    sourceBase = this.getBase();
                    SurfacePropertyType copyBase = ((SurfacePropertyType) strategy.copy(LocatorUtils.property(locator, "base", sourceBase), sourceBase, this.isSetBase()));
                    copy.setBase(copyBase);
                } else {
                    if (baseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.base = null;
                    }
                }
            }
            {
                Boolean heightShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetHeight());
                if (heightShouldBeCopiedAndSet == Boolean.TRUE) {
                    LengthType sourceHeight;
                    sourceHeight = this.getHeight();
                    LengthType copyHeight = ((LengthType) strategy.copy(LocatorUtils.property(locator, "height", sourceHeight), sourceHeight, this.isSetHeight()));
                    copy.setHeight(copyHeight);
                } else {
                    if (heightShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.height = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PrismType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof PrismType) {
            final PrismType target = this;
            final PrismType leftObject = ((PrismType) left);
            final PrismType rightObject = ((PrismType) right);
            {
                Boolean baseShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetBase(), rightObject.isSetBase());
                if (baseShouldBeMergedAndSet == Boolean.TRUE) {
                    SurfacePropertyType lhsBase;
                    lhsBase = leftObject.getBase();
                    SurfacePropertyType rhsBase;
                    rhsBase = rightObject.getBase();
                    SurfacePropertyType mergedBase = ((SurfacePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "base", lhsBase), LocatorUtils.property(rightLocator, "base", rhsBase), lhsBase, rhsBase, leftObject.isSetBase(), rightObject.isSetBase()));
                    target.setBase(mergedBase);
                } else {
                    if (baseShouldBeMergedAndSet == Boolean.FALSE) {
                        target.base = null;
                    }
                }
            }
            {
                Boolean heightShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetHeight(), rightObject.isSetHeight());
                if (heightShouldBeMergedAndSet == Boolean.TRUE) {
                    LengthType lhsHeight;
                    lhsHeight = leftObject.getHeight();
                    LengthType rhsHeight;
                    rhsHeight = rightObject.getHeight();
                    LengthType mergedHeight = ((LengthType) strategy.merge(LocatorUtils.property(leftLocator, "height", lhsHeight), LocatorUtils.property(rightLocator, "height", rhsHeight), lhsHeight, rhsHeight, leftObject.isSetHeight(), rightObject.isSetHeight()));
                    target.setHeight(mergedHeight);
                } else {
                    if (heightShouldBeMergedAndSet == Boolean.FALSE) {
                        target.height = null;
                    }
                }
            }
        }
    }

    public PrismType withBase(SurfacePropertyType value) {
        setBase(value);
        return this;
    }

    public PrismType withHeight(LengthType value) {
        setHeight(value);
        return this;
    }

}
