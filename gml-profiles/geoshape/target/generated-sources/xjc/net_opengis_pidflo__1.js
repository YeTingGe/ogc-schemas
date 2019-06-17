var net_opengis_pidflo__1_Module_Factory = function () {
  var net_opengis_pidflo__1 = {
    n: 'net_opengis_pidflo__1',
    dens: 'http:\/\/www.opengis.net\/pidflo\/1.0',
    deps: ['net_opengis_gml_v_3_1_1'],
    tis: [{
        ln: 'EllipsoidType',
        bti: 'net_opengis_gml_v_3_1_1.AbstractSolidType',
        ps: [{
            n: 'pos',
            rq: true,
            en: {
              lp: 'pos',
              ns: 'http:\/\/www.opengis.net\/gml'
            },
            ti: 'net_opengis_gml_v_3_1_1.DirectPositionType'
          }, {
            n: 'pointProperty',
            rq: true,
            en: {
              lp: 'pointProperty',
              ns: 'http:\/\/www.opengis.net\/gml'
            },
            ti: 'net_opengis_gml_v_3_1_1.PointPropertyType'
          }, {
            n: 'semiMajorAxis',
            rq: true,
            ti: 'net_opengis_gml_v_3_1_1.LengthType'
          }, {
            n: 'semiMinorAxis',
            rq: true,
            ti: 'net_opengis_gml_v_3_1_1.LengthType'
          }, {
            n: 'verticalAxis',
            rq: true,
            ti: 'net_opengis_gml_v_3_1_1.LengthType'
          }, {
            n: 'orientation',
            rq: true,
            ti: 'net_opengis_gml_v_3_1_1.AngleType'
          }]
      }, {
        ln: 'EllipseType',
        bti: 'net_opengis_gml_v_3_1_1.AbstractSurfaceType',
        ps: [{
            n: 'pos',
            rq: true,
            en: {
              lp: 'pos',
              ns: 'http:\/\/www.opengis.net\/gml'
            },
            ti: 'net_opengis_gml_v_3_1_1.DirectPositionType'
          }, {
            n: 'pointProperty',
            rq: true,
            en: {
              lp: 'pointProperty',
              ns: 'http:\/\/www.opengis.net\/gml'
            },
            ti: 'net_opengis_gml_v_3_1_1.PointPropertyType'
          }, {
            n: 'semiMajorAxis',
            rq: true,
            ti: 'net_opengis_gml_v_3_1_1.LengthType'
          }, {
            n: 'semiMinorAxis',
            rq: true,
            ti: 'net_opengis_gml_v_3_1_1.LengthType'
          }, {
            n: 'orientation',
            rq: true,
            ti: 'net_opengis_gml_v_3_1_1.AngleType'
          }]
      }, {
        ln: 'ArcBandType',
        bti: 'net_opengis_gml_v_3_1_1.AbstractSurfaceType',
        ps: [{
            n: 'pos',
            rq: true,
            en: {
              lp: 'pos',
              ns: 'http:\/\/www.opengis.net\/gml'
            },
            ti: 'net_opengis_gml_v_3_1_1.DirectPositionType'
          }, {
            n: 'pointProperty',
            rq: true,
            en: {
              lp: 'pointProperty',
              ns: 'http:\/\/www.opengis.net\/gml'
            },
            ti: 'net_opengis_gml_v_3_1_1.PointPropertyType'
          }, {
            n: 'innerRadius',
            rq: true,
            ti: 'net_opengis_gml_v_3_1_1.LengthType'
          }, {
            n: 'outerRadius',
            rq: true,
            ti: 'net_opengis_gml_v_3_1_1.LengthType'
          }, {
            n: 'startAngle',
            rq: true,
            ti: 'net_opengis_gml_v_3_1_1.AngleType'
          }, {
            n: 'openingAngle',
            rq: true,
            ti: 'net_opengis_gml_v_3_1_1.AngleType'
          }]
      }, {
        ln: 'PrismType',
        bti: 'net_opengis_gml_v_3_1_1.AbstractSolidType',
        ps: [{
            n: 'base',
            rq: true,
            ti: 'net_opengis_gml_v_3_1_1.SurfacePropertyType'
          }, {
            n: 'height',
            rq: true,
            ti: 'net_opengis_gml_v_3_1_1.LengthType'
          }]
      }, {
        ln: 'CircleType',
        bti: 'net_opengis_gml_v_3_1_1.AbstractSurfaceType',
        ps: [{
            n: 'pos',
            rq: true,
            en: {
              lp: 'pos',
              ns: 'http:\/\/www.opengis.net\/gml'
            },
            ti: 'net_opengis_gml_v_3_1_1.DirectPositionType'
          }, {
            n: 'pointProperty',
            rq: true,
            en: {
              lp: 'pointProperty',
              ns: 'http:\/\/www.opengis.net\/gml'
            },
            ti: 'net_opengis_gml_v_3_1_1.PointPropertyType'
          }, {
            n: 'radius',
            rq: true,
            ti: 'net_opengis_gml_v_3_1_1.LengthType'
          }]
      }, {
        ln: 'SphereType',
        bti: 'net_opengis_gml_v_3_1_1.AbstractSolidType',
        ps: [{
            n: 'pos',
            rq: true,
            en: {
              lp: 'pos',
              ns: 'http:\/\/www.opengis.net\/gml'
            },
            ti: 'net_opengis_gml_v_3_1_1.DirectPositionType'
          }, {
            n: 'pointProperty',
            rq: true,
            en: {
              lp: 'pointProperty',
              ns: 'http:\/\/www.opengis.net\/gml'
            },
            ti: 'net_opengis_gml_v_3_1_1.PointPropertyType'
          }, {
            n: 'radius',
            rq: true,
            ti: 'net_opengis_gml_v_3_1_1.LengthType'
          }]
      }],
    eis: [{
        en: 'ArcBand',
        ti: '.ArcBandType',
        sh: {
          lp: '_Surface',
          ns: 'http:\/\/www.opengis.net\/gml'
        }
      }, {
        en: 'Ellipse',
        ti: '.EllipseType',
        sh: {
          lp: '_Surface',
          ns: 'http:\/\/www.opengis.net\/gml'
        }
      }, {
        en: 'Sphere',
        ti: '.SphereType',
        sh: {
          lp: '_Solid',
          ns: 'http:\/\/www.opengis.net\/gml'
        }
      }, {
        en: 'Circle',
        ti: '.CircleType',
        sh: {
          lp: '_Surface',
          ns: 'http:\/\/www.opengis.net\/gml'
        }
      }, {
        en: 'Ellipsoid',
        ti: '.EllipsoidType',
        sh: {
          lp: '_Solid',
          ns: 'http:\/\/www.opengis.net\/gml'
        }
      }, {
        en: 'Prism',
        ti: '.PrismType',
        sh: {
          lp: '_Solid',
          ns: 'http:\/\/www.opengis.net\/gml'
        }
      }]
  };
  return {
    net_opengis_pidflo__1: net_opengis_pidflo__1
  };
};
if (typeof define === 'function' && define.amd) {
  define([], net_opengis_pidflo__1_Module_Factory);
}
else {
  var net_opengis_pidflo__1_Module = net_opengis_pidflo__1_Module_Factory();
  if (typeof module !== 'undefined' && module.exports) {
    module.exports.net_opengis_pidflo__1 = net_opengis_pidflo__1_Module.net_opengis_pidflo__1;
  }
  else {
    var net_opengis_pidflo__1 = net_opengis_pidflo__1_Module.net_opengis_pidflo__1;
  }
}