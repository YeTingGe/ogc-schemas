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
import net.opengis.gml.v_3_1_1.AngleType;
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
 * <p>ArcBandType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArcBandType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractSurfaceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.opengis.net/pidflo/1.0}centerGroup"/&gt;
 *         &lt;element name="innerRadius" type="{http://www.opengis.net/gml}LengthType"/&gt;
 *         &lt;element name="outerRadius" type="{http://www.opengis.net/gml}LengthType"/&gt;
 *         &lt;element name="startAngle" type="{http://www.opengis.net/gml}AngleType"/&gt;
 *         &lt;element name="openingAngle" type="{http://www.opengis.net/gml}AngleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArcBandType", propOrder = {
    "pos",
    "pointProperty",
    "innerRadius",
    "outerRadius",
    "startAngle",
    "openingAngle"
})
public class ArcBandType
    extends AbstractSurfaceType
    implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(namespace = "http://www.opengis.net/gml")
    protected DirectPositionType pos;
    @XmlElement(namespace = "http://www.opengis.net/gml")
    protected PointPropertyType pointProperty;
    @XmlElement(required = true)
    protected LengthType innerRadius;
    @XmlElement(required = true)
    protected LengthType outerRadius;
    @XmlElement(required = true)
    protected AngleType startAngle;
    @XmlElement(required = true)
    protected AngleType openingAngle;

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
     * 获取innerRadius属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getInnerRadius() {
        return innerRadius;
    }

    /**
     * 设置innerRadius属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setInnerRadius(LengthType value) {
        this.innerRadius = value;
    }

    public boolean isSetInnerRadius() {
        return (this.innerRadius!= null);
    }

    /**
     * 获取outerRadius属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getOuterRadius() {
        return outerRadius;
    }

    /**
     * 设置outerRadius属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setOuterRadius(LengthType value) {
        this.outerRadius = value;
    }

    public boolean isSetOuterRadius() {
        return (this.outerRadius!= null);
    }

    /**
     * 获取startAngle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getStartAngle() {
        return startAngle;
    }

    /**
     * 设置startAngle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setStartAngle(AngleType value) {
        this.startAngle = value;
    }

    public boolean isSetStartAngle() {
        return (this.startAngle!= null);
    }

    /**
     * 获取openingAngle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getOpeningAngle() {
        return openingAngle;
    }

    /**
     * 设置openingAngle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setOpeningAngle(AngleType value) {
        this.openingAngle = value;
    }

    public boolean isSetOpeningAngle() {
        return (this.openingAngle!= null);
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
            LengthType theInnerRadius;
            theInnerRadius = this.getInnerRadius();
            strategy.appendField(locator, this, "innerRadius", buffer, theInnerRadius, this.isSetInnerRadius());
        }
        {
            LengthType theOuterRadius;
            theOuterRadius = this.getOuterRadius();
            strategy.appendField(locator, this, "outerRadius", buffer, theOuterRadius, this.isSetOuterRadius());
        }
        {
            AngleType theStartAngle;
            theStartAngle = this.getStartAngle();
            strategy.appendField(locator, this, "startAngle", buffer, theStartAngle, this.isSetStartAngle());
        }
        {
            AngleType theOpeningAngle;
            theOpeningAngle = this.getOpeningAngle();
            strategy.appendField(locator, this, "openingAngle", buffer, theOpeningAngle, this.isSetOpeningAngle());
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
        final ArcBandType that = ((ArcBandType) object);
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
            LengthType lhsInnerRadius;
            lhsInnerRadius = this.getInnerRadius();
            LengthType rhsInnerRadius;
            rhsInnerRadius = that.getInnerRadius();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "innerRadius", lhsInnerRadius), LocatorUtils.property(thatLocator, "innerRadius", rhsInnerRadius), lhsInnerRadius, rhsInnerRadius, this.isSetInnerRadius(), that.isSetInnerRadius())) {
                return false;
            }
        }
        {
            LengthType lhsOuterRadius;
            lhsOuterRadius = this.getOuterRadius();
            LengthType rhsOuterRadius;
            rhsOuterRadius = that.getOuterRadius();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outerRadius", lhsOuterRadius), LocatorUtils.property(thatLocator, "outerRadius", rhsOuterRadius), lhsOuterRadius, rhsOuterRadius, this.isSetOuterRadius(), that.isSetOuterRadius())) {
                return false;
            }
        }
        {
            AngleType lhsStartAngle;
            lhsStartAngle = this.getStartAngle();
            AngleType rhsStartAngle;
            rhsStartAngle = that.getStartAngle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startAngle", lhsStartAngle), LocatorUtils.property(thatLocator, "startAngle", rhsStartAngle), lhsStartAngle, rhsStartAngle, this.isSetStartAngle(), that.isSetStartAngle())) {
                return false;
            }
        }
        {
            AngleType lhsOpeningAngle;
            lhsOpeningAngle = this.getOpeningAngle();
            AngleType rhsOpeningAngle;
            rhsOpeningAngle = that.getOpeningAngle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "openingAngle", lhsOpeningAngle), LocatorUtils.property(thatLocator, "openingAngle", rhsOpeningAngle), lhsOpeningAngle, rhsOpeningAngle, this.isSetOpeningAngle(), that.isSetOpeningAngle())) {
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
            LengthType theInnerRadius;
            theInnerRadius = this.getInnerRadius();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "innerRadius", theInnerRadius), currentHashCode, theInnerRadius, this.isSetInnerRadius());
        }
        {
            LengthType theOuterRadius;
            theOuterRadius = this.getOuterRadius();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outerRadius", theOuterRadius), currentHashCode, theOuterRadius, this.isSetOuterRadius());
        }
        {
            AngleType theStartAngle;
            theStartAngle = this.getStartAngle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startAngle", theStartAngle), currentHashCode, theStartAngle, this.isSetStartAngle());
        }
        {
            AngleType theOpeningAngle;
            theOpeningAngle = this.getOpeningAngle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "openingAngle", theOpeningAngle), currentHashCode, theOpeningAngle, this.isSetOpeningAngle());
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
        if (draftCopy instanceof ArcBandType) {
            final ArcBandType copy = ((ArcBandType) draftCopy);
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
                Boolean innerRadiusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetInnerRadius());
                if (innerRadiusShouldBeCopiedAndSet == Boolean.TRUE) {
                    LengthType sourceInnerRadius;
                    sourceInnerRadius = this.getInnerRadius();
                    LengthType copyInnerRadius = ((LengthType) strategy.copy(LocatorUtils.property(locator, "innerRadius", sourceInnerRadius), sourceInnerRadius, this.isSetInnerRadius()));
                    copy.setInnerRadius(copyInnerRadius);
                } else {
                    if (innerRadiusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.innerRadius = null;
                    }
                }
            }
            {
                Boolean outerRadiusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetOuterRadius());
                if (outerRadiusShouldBeCopiedAndSet == Boolean.TRUE) {
                    LengthType sourceOuterRadius;
                    sourceOuterRadius = this.getOuterRadius();
                    LengthType copyOuterRadius = ((LengthType) strategy.copy(LocatorUtils.property(locator, "outerRadius", sourceOuterRadius), sourceOuterRadius, this.isSetOuterRadius()));
                    copy.setOuterRadius(copyOuterRadius);
                } else {
                    if (outerRadiusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.outerRadius = null;
                    }
                }
            }
            {
                Boolean startAngleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetStartAngle());
                if (startAngleShouldBeCopiedAndSet == Boolean.TRUE) {
                    AngleType sourceStartAngle;
                    sourceStartAngle = this.getStartAngle();
                    AngleType copyStartAngle = ((AngleType) strategy.copy(LocatorUtils.property(locator, "startAngle", sourceStartAngle), sourceStartAngle, this.isSetStartAngle()));
                    copy.setStartAngle(copyStartAngle);
                } else {
                    if (startAngleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.startAngle = null;
                    }
                }
            }
            {
                Boolean openingAngleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetOpeningAngle());
                if (openingAngleShouldBeCopiedAndSet == Boolean.TRUE) {
                    AngleType sourceOpeningAngle;
                    sourceOpeningAngle = this.getOpeningAngle();
                    AngleType copyOpeningAngle = ((AngleType) strategy.copy(LocatorUtils.property(locator, "openingAngle", sourceOpeningAngle), sourceOpeningAngle, this.isSetOpeningAngle()));
                    copy.setOpeningAngle(copyOpeningAngle);
                } else {
                    if (openingAngleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.openingAngle = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ArcBandType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof ArcBandType) {
            final ArcBandType target = this;
            final ArcBandType leftObject = ((ArcBandType) left);
            final ArcBandType rightObject = ((ArcBandType) right);
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
                Boolean innerRadiusShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetInnerRadius(), rightObject.isSetInnerRadius());
                if (innerRadiusShouldBeMergedAndSet == Boolean.TRUE) {
                    LengthType lhsInnerRadius;
                    lhsInnerRadius = leftObject.getInnerRadius();
                    LengthType rhsInnerRadius;
                    rhsInnerRadius = rightObject.getInnerRadius();
                    LengthType mergedInnerRadius = ((LengthType) strategy.merge(LocatorUtils.property(leftLocator, "innerRadius", lhsInnerRadius), LocatorUtils.property(rightLocator, "innerRadius", rhsInnerRadius), lhsInnerRadius, rhsInnerRadius, leftObject.isSetInnerRadius(), rightObject.isSetInnerRadius()));
                    target.setInnerRadius(mergedInnerRadius);
                } else {
                    if (innerRadiusShouldBeMergedAndSet == Boolean.FALSE) {
                        target.innerRadius = null;
                    }
                }
            }
            {
                Boolean outerRadiusShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetOuterRadius(), rightObject.isSetOuterRadius());
                if (outerRadiusShouldBeMergedAndSet == Boolean.TRUE) {
                    LengthType lhsOuterRadius;
                    lhsOuterRadius = leftObject.getOuterRadius();
                    LengthType rhsOuterRadius;
                    rhsOuterRadius = rightObject.getOuterRadius();
                    LengthType mergedOuterRadius = ((LengthType) strategy.merge(LocatorUtils.property(leftLocator, "outerRadius", lhsOuterRadius), LocatorUtils.property(rightLocator, "outerRadius", rhsOuterRadius), lhsOuterRadius, rhsOuterRadius, leftObject.isSetOuterRadius(), rightObject.isSetOuterRadius()));
                    target.setOuterRadius(mergedOuterRadius);
                } else {
                    if (outerRadiusShouldBeMergedAndSet == Boolean.FALSE) {
                        target.outerRadius = null;
                    }
                }
            }
            {
                Boolean startAngleShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetStartAngle(), rightObject.isSetStartAngle());
                if (startAngleShouldBeMergedAndSet == Boolean.TRUE) {
                    AngleType lhsStartAngle;
                    lhsStartAngle = leftObject.getStartAngle();
                    AngleType rhsStartAngle;
                    rhsStartAngle = rightObject.getStartAngle();
                    AngleType mergedStartAngle = ((AngleType) strategy.merge(LocatorUtils.property(leftLocator, "startAngle", lhsStartAngle), LocatorUtils.property(rightLocator, "startAngle", rhsStartAngle), lhsStartAngle, rhsStartAngle, leftObject.isSetStartAngle(), rightObject.isSetStartAngle()));
                    target.setStartAngle(mergedStartAngle);
                } else {
                    if (startAngleShouldBeMergedAndSet == Boolean.FALSE) {
                        target.startAngle = null;
                    }
                }
            }
            {
                Boolean openingAngleShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetOpeningAngle(), rightObject.isSetOpeningAngle());
                if (openingAngleShouldBeMergedAndSet == Boolean.TRUE) {
                    AngleType lhsOpeningAngle;
                    lhsOpeningAngle = leftObject.getOpeningAngle();
                    AngleType rhsOpeningAngle;
                    rhsOpeningAngle = rightObject.getOpeningAngle();
                    AngleType mergedOpeningAngle = ((AngleType) strategy.merge(LocatorUtils.property(leftLocator, "openingAngle", lhsOpeningAngle), LocatorUtils.property(rightLocator, "openingAngle", rhsOpeningAngle), lhsOpeningAngle, rhsOpeningAngle, leftObject.isSetOpeningAngle(), rightObject.isSetOpeningAngle()));
                    target.setOpeningAngle(mergedOpeningAngle);
                } else {
                    if (openingAngleShouldBeMergedAndSet == Boolean.FALSE) {
                        target.openingAngle = null;
                    }
                }
            }
        }
    }

    public ArcBandType withPos(DirectPositionType value) {
        setPos(value);
        return this;
    }

    public ArcBandType withPointProperty(PointPropertyType value) {
        setPointProperty(value);
        return this;
    }

    public ArcBandType withInnerRadius(LengthType value) {
        setInnerRadius(value);
        return this;
    }

    public ArcBandType withOuterRadius(LengthType value) {
        setOuterRadius(value);
        return this;
    }

    public ArcBandType withStartAngle(AngleType value) {
        setStartAngle(value);
        return this;
    }

    public ArcBandType withOpeningAngle(AngleType value) {
        setOpeningAngle(value);
        return this;
    }

}
