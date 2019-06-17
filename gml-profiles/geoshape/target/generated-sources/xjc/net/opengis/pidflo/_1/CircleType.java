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
import net.opengis.gml.v_3_1_1.AbstractSurfaceType;
import net.opengis.gml.v_3_1_1.DirectPositionType;
import net.opengis.gml.v_3_1_1.LengthType;
import net.opengis.gml.v_3_1_1.PointPropertyType;
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
 * <p>CircleType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CircleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractSurfaceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.opengis.net/pidflo/1.0}centerGroup"/&gt;
 *         &lt;element name="radius" type="{http://www.opengis.net/gml}LengthType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CircleType", propOrder = {
    "pos",
    "pointProperty",
    "radius"
})
public class CircleType
    extends AbstractSurfaceType
    implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(namespace = "http://www.opengis.net/gml")
    protected DirectPositionType pos;
    @XmlElement(namespace = "http://www.opengis.net/gml")
    protected PointPropertyType pointProperty;
    @XmlElement(required = true)
    protected LengthType radius;

    /**
     * 获取pos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getPos() {
        return pos;
    }

    /**
     * 设置pos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setPos(DirectPositionType value) {
        this.pos = value;
    }

    public boolean isSetPos() {
        return (this.pos!= null);
    }

    /**
     * 获取pointProperty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPointProperty() {
        return pointProperty;
    }

    /**
     * 设置pointProperty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPointProperty(PointPropertyType value) {
        this.pointProperty = value;
    }

    public boolean isSetPointProperty() {
        return (this.pointProperty!= null);
    }

    /**
     * 获取radius属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getRadius() {
        return radius;
    }

    /**
     * 设置radius属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setRadius(LengthType value) {
        this.radius = value;
    }

    public boolean isSetRadius() {
        return (this.radius!= null);
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
            DirectPositionType thePos;
            thePos = this.getPos();
            strategy.appendField(locator, this, "pos", buffer, thePos, this.isSetPos());
        }
        {
            PointPropertyType thePointProperty;
            thePointProperty = this.getPointProperty();
            strategy.appendField(locator, this, "pointProperty", buffer, thePointProperty, this.isSetPointProperty());
        }
        {
            LengthType theRadius;
            theRadius = this.getRadius();
            strategy.appendField(locator, this, "radius", buffer, theRadius, this.isSetRadius());
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
        final CircleType that = ((CircleType) object);
        {
            DirectPositionType lhsPos;
            lhsPos = this.getPos();
            DirectPositionType rhsPos;
            rhsPos = that.getPos();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pos", lhsPos), LocatorUtils.property(thatLocator, "pos", rhsPos), lhsPos, rhsPos, this.isSetPos(), that.isSetPos())) {
                return false;
            }
        }
        {
            PointPropertyType lhsPointProperty;
            lhsPointProperty = this.getPointProperty();
            PointPropertyType rhsPointProperty;
            rhsPointProperty = that.getPointProperty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pointProperty", lhsPointProperty), LocatorUtils.property(thatLocator, "pointProperty", rhsPointProperty), lhsPointProperty, rhsPointProperty, this.isSetPointProperty(), that.isSetPointProperty())) {
                return false;
            }
        }
        {
            LengthType lhsRadius;
            lhsRadius = this.getRadius();
            LengthType rhsRadius;
            rhsRadius = that.getRadius();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "radius", lhsRadius), LocatorUtils.property(thatLocator, "radius", rhsRadius), lhsRadius, rhsRadius, this.isSetRadius(), that.isSetRadius())) {
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
            DirectPositionType thePos;
            thePos = this.getPos();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pos", thePos), currentHashCode, thePos, this.isSetPos());
        }
        {
            PointPropertyType thePointProperty;
            thePointProperty = this.getPointProperty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pointProperty", thePointProperty), currentHashCode, thePointProperty, this.isSetPointProperty());
        }
        {
            LengthType theRadius;
            theRadius = this.getRadius();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "radius", theRadius), currentHashCode, theRadius, this.isSetRadius());
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
        if (draftCopy instanceof CircleType) {
            final CircleType copy = ((CircleType) draftCopy);
            {
                Boolean posShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetPos());
                if (posShouldBeCopiedAndSet == Boolean.TRUE) {
                    DirectPositionType sourcePos;
                    sourcePos = this.getPos();
                    DirectPositionType copyPos = ((DirectPositionType) strategy.copy(LocatorUtils.property(locator, "pos", sourcePos), sourcePos, this.isSetPos()));
                    copy.setPos(copyPos);
                } else {
                    if (posShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pos = null;
                    }
                }
            }
            {
                Boolean pointPropertyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetPointProperty());
                if (pointPropertyShouldBeCopiedAndSet == Boolean.TRUE) {
                    PointPropertyType sourcePointProperty;
                    sourcePointProperty = this.getPointProperty();
                    PointPropertyType copyPointProperty = ((PointPropertyType) strategy.copy(LocatorUtils.property(locator, "pointProperty", sourcePointProperty), sourcePointProperty, this.isSetPointProperty()));
                    copy.setPointProperty(copyPointProperty);
                } else {
                    if (pointPropertyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pointProperty = null;
                    }
                }
            }
            {
                Boolean radiusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetRadius());
                if (radiusShouldBeCopiedAndSet == Boolean.TRUE) {
                    LengthType sourceRadius;
                    sourceRadius = this.getRadius();
                    LengthType copyRadius = ((LengthType) strategy.copy(LocatorUtils.property(locator, "radius", sourceRadius), sourceRadius, this.isSetRadius()));
                    copy.setRadius(copyRadius);
                } else {
                    if (radiusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.radius = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CircleType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof CircleType) {
            final CircleType target = this;
            final CircleType leftObject = ((CircleType) left);
            final CircleType rightObject = ((CircleType) right);
            {
                Boolean posShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetPos(), rightObject.isSetPos());
                if (posShouldBeMergedAndSet == Boolean.TRUE) {
                    DirectPositionType lhsPos;
                    lhsPos = leftObject.getPos();
                    DirectPositionType rhsPos;
                    rhsPos = rightObject.getPos();
                    DirectPositionType mergedPos = ((DirectPositionType) strategy.merge(LocatorUtils.property(leftLocator, "pos", lhsPos), LocatorUtils.property(rightLocator, "pos", rhsPos), lhsPos, rhsPos, leftObject.isSetPos(), rightObject.isSetPos()));
                    target.setPos(mergedPos);
                } else {
                    if (posShouldBeMergedAndSet == Boolean.FALSE) {
                        target.pos = null;
                    }
                }
            }
            {
                Boolean pointPropertyShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetPointProperty(), rightObject.isSetPointProperty());
                if (pointPropertyShouldBeMergedAndSet == Boolean.TRUE) {
                    PointPropertyType lhsPointProperty;
                    lhsPointProperty = leftObject.getPointProperty();
                    PointPropertyType rhsPointProperty;
                    rhsPointProperty = rightObject.getPointProperty();
                    PointPropertyType mergedPointProperty = ((PointPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "pointProperty", lhsPointProperty), LocatorUtils.property(rightLocator, "pointProperty", rhsPointProperty), lhsPointProperty, rhsPointProperty, leftObject.isSetPointProperty(), rightObject.isSetPointProperty()));
                    target.setPointProperty(mergedPointProperty);
                } else {
                    if (pointPropertyShouldBeMergedAndSet == Boolean.FALSE) {
                        target.pointProperty = null;
                    }
                }
            }
            {
                Boolean radiusShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetRadius(), rightObject.isSetRadius());
                if (radiusShouldBeMergedAndSet == Boolean.TRUE) {
                    LengthType lhsRadius;
                    lhsRadius = leftObject.getRadius();
                    LengthType rhsRadius;
                    rhsRadius = rightObject.getRadius();
                    LengthType mergedRadius = ((LengthType) strategy.merge(LocatorUtils.property(leftLocator, "radius", lhsRadius), LocatorUtils.property(rightLocator, "radius", rhsRadius), lhsRadius, rhsRadius, leftObject.isSetRadius(), rightObject.isSetRadius()));
                    target.setRadius(mergedRadius);
                } else {
                    if (radiusShouldBeMergedAndSet == Boolean.FALSE) {
                        target.radius = null;
                    }
                }
            }
        }
    }

    public CircleType withPos(DirectPositionType value) {
        setPos(value);
        return this;
    }

    public CircleType withPointProperty(PointPropertyType value) {
        setPointProperty(value);
        return this;
    }

    public CircleType withRadius(LengthType value) {
        setRadius(value);
        return this;
    }

}
