var SLD_1_0_0_Module_Factory = function () {
  var SLD_1_0_0 = {
    n: 'SLD_1_0_0',
    dens: 'http:\/\/www.opengis.net\/sld',
    dans: 'http:\/\/www.w3.org\/1999\/xlink',
    deps: ['Filter_1_0_0', 'XLink_1_0'],
    tis: [{
        ln: 'NamedStyle',
        tn: null,
        ps: [{
            n: 'name',
            en: 'Name'
          }]
      }, {
        ln: 'LayerFeatureConstraints',
        tn: null,
        ps: [{
            n: 'featureTypeConstraint',
            col: true,
            en: 'FeatureTypeConstraint',
            ti: '.FeatureTypeConstraint'
          }]
      }, {
        ln: 'PointPlacement',
        tn: null,
        ps: [{
            n: 'anchorPoint',
            en: 'AnchorPoint',
            ti: '.AnchorPoint'
          }, {
            n: 'displacement',
            en: 'Displacement',
            ti: '.Displacement'
          }, {
            n: 'rotation',
            en: 'Rotation',
            ti: '.ParameterValueType'
          }]
      }, {
        ln: 'CssParameter',
        tn: null,
        bti: '.ParameterValueType',
        ps: [{
            n: 'name',
            an: {
              lp: 'name'
            },
            t: 'a'
          }]
      }, {
        ln: 'ColorMap',
        tn: null,
        ps: [{
            n: 'colorMapEntry',
            col: true,
            en: 'ColorMapEntry',
            ti: '.ColorMapEntry'
          }]
      }, {
        ln: 'PointSymbolizer',
        tn: null,
        bti: '.SymbolizerType',
        ps: [{
            n: 'geometry',
            en: 'Geometry',
            ti: '.Geometry'
          }, {
            n: 'graphic',
            en: 'Graphic',
            ti: '.Graphic'
          }]
      }, {
        ln: 'SelectedChannelType',
        ps: [{
            n: 'sourceChannelName',
            en: 'SourceChannelName'
          }, {
            n: 'contrastEnhancement',
            en: 'ContrastEnhancement',
            ti: '.ContrastEnhancement'
          }]
      }, {
        ln: 'EARLIESTONTOP',
        tn: null
      }, {
        ln: 'UserStyle',
        tn: null,
        ps: [{
            n: 'name',
            en: 'Name'
          }, {
            n: 'title',
            en: 'Title'
          }, {
            n: '_abstract',
            en: 'Abstract'
          }, {
            n: 'isDefault',
            en: 'IsDefault',
            ti: 'Boolean'
          }, {
            n: 'featureTypeStyle',
            col: true,
            en: 'FeatureTypeStyle',
            ti: '.FeatureTypeStyle'
          }]
      }, {
        ln: 'Histogram',
        tn: null
      }, {
        ln: 'Mark',
        tn: null,
        ps: [{
            n: 'wellKnownName',
            en: 'WellKnownName'
          }, {
            n: 'fill',
            en: 'Fill',
            ti: '.Fill'
          }, {
            n: 'stroke',
            en: 'Stroke',
            ti: '.Stroke'
          }]
      }, {
        ln: 'ContrastEnhancement',
        tn: null,
        ps: [{
            n: 'normalize',
            en: 'Normalize',
            ti: '.Normalize'
          }, {
            n: 'histogram',
            en: 'Histogram',
            ti: '.Histogram'
          }, {
            n: 'gammaValue',
            en: 'GammaValue',
            ti: 'Double'
          }]
      }, {
        ln: 'AVERAGE',
        tn: null
      }, {
        ln: 'Normalize',
        tn: null
      }, {
        ln: 'LabelPlacement',
        tn: null,
        ps: [{
            n: 'pointPlacement',
            en: 'PointPlacement',
            ti: '.PointPlacement'
          }, {
            n: 'linePlacement',
            en: 'LinePlacement',
            ti: '.LinePlacement'
          }]
      }, {
        ln: 'Fill',
        tn: null,
        ps: [{
            n: 'graphicFill',
            en: 'GraphicFill',
            ti: '.GraphicFill'
          }, {
            n: 'cssParameter',
            col: true,
            en: 'CssParameter',
            ti: '.CssParameter'
          }]
      }, {
        ln: 'Rule',
        tn: null,
        ps: [{
            n: 'name',
            en: 'Name'
          }, {
            n: 'title',
            en: 'Title'
          }, {
            n: '_abstract',
            en: 'Abstract'
          }, {
            n: 'legendGraphic',
            en: 'LegendGraphic',
            ti: '.LegendGraphic'
          }, {
            n: 'filter',
            en: {
              lp: 'Filter',
              ns: 'http:\/\/www.opengis.net\/ogc'
            },
            ti: 'Filter_1_0_0.FilterType'
          }, {
            n: 'elseFilter',
            en: 'ElseFilter',
            ti: '.ElseFilter'
          }, {
            n: 'minScaleDenominator',
            en: 'MinScaleDenominator',
            ti: 'Double'
          }, {
            n: 'maxScaleDenominator',
            en: 'MaxScaleDenominator',
            ti: 'Double'
          }, {
            n: 'symbolizer',
            col: true,
            mx: false,
            dom: false,
            en: 'Symbolizer',
            ti: '.SymbolizerType',
            t: 'er'
          }]
      }, {
        ln: 'ShadedRelief',
        tn: null,
        ps: [{
            n: 'brightnessOnly',
            en: 'BrightnessOnly',
            ti: 'Boolean'
          }, {
            n: 'reliefFactor',
            en: 'ReliefFactor',
            ti: 'Double'
          }]
      }, {
        ln: 'Halo',
        tn: null,
        ps: [{
            n: 'radius',
            en: 'Radius',
            ti: '.ParameterValueType'
          }, {
            n: 'fill',
            en: 'Fill',
            ti: '.Fill'
          }]
      }, {
        ln: 'LineSymbolizer',
        tn: null,
        bti: '.SymbolizerType',
        ps: [{
            n: 'geometry',
            en: 'Geometry',
            ti: '.Geometry'
          }, {
            n: 'stroke',
            en: 'Stroke',
            ti: '.Stroke'
          }]
      }, {
        ln: 'LinePlacement',
        tn: null,
        ps: [{
            n: 'perpendicularOffset',
            en: 'PerpendicularOffset',
            ti: '.ParameterValueType'
          }]
      }, {
        ln: 'NamedLayer',
        tn: null,
        ps: [{
            n: 'name',
            en: 'Name'
          }, {
            n: 'layerFeatureConstraints',
            en: 'LayerFeatureConstraints',
            ti: '.LayerFeatureConstraints'
          }, {
            n: 'namedStyleOrUserStyle',
            col: true,
            etis: [{
                en: 'NamedStyle',
                ti: '.NamedStyle'
              }, {
                en: 'UserStyle',
                ti: '.UserStyle'
              }],
            t: 'es'
          }]
      }, {
        ln: 'ExternalGraphic',
        tn: null,
        ps: [{
            n: 'onlineResource',
            en: 'OnlineResource',
            ti: '.OnlineResource'
          }, {
            n: 'format',
            en: 'Format'
          }]
      }, {
        ln: 'ParameterValueType',
        ps: [{
            n: 'content',
            col: true,
            dom: false,
            en: {
              lp: 'expression',
              ns: 'http:\/\/www.opengis.net\/ogc'
            },
            ti: 'Filter_1_0_0.ExpressionType',
            t: 'er'
          }]
      }, {
        ln: 'TextSymbolizer',
        tn: null,
        bti: '.SymbolizerType',
        ps: [{
            n: 'geometry',
            en: 'Geometry',
            ti: '.Geometry'
          }, {
            n: 'label',
            en: 'Label',
            ti: '.ParameterValueType'
          }, {
            n: 'font',
            en: 'Font',
            ti: '.Font'
          }, {
            n: 'labelPlacement',
            en: 'LabelPlacement',
            ti: '.LabelPlacement'
          }, {
            n: 'halo',
            en: 'Halo',
            ti: '.Halo'
          }, {
            n: 'fill',
            en: 'Fill',
            ti: '.Fill'
          }]
      }, {
        ln: 'UserLayer',
        tn: null,
        ps: [{
            n: 'name',
            en: 'Name'
          }, {
            n: 'remoteOWS',
            en: 'RemoteOWS',
            ti: '.RemoteOWS'
          }, {
            n: 'layerFeatureConstraints',
            en: 'LayerFeatureConstraints',
            ti: '.LayerFeatureConstraints'
          }, {
            n: 'userStyle',
            col: true,
            en: 'UserStyle',
            ti: '.UserStyle'
          }]
      }, {
        ln: 'RasterSymbolizer',
        tn: null,
        bti: '.SymbolizerType',
        ps: [{
            n: 'geometry',
            en: 'Geometry',
            ti: '.Geometry'
          }, {
            n: 'opacity',
            en: 'Opacity',
            ti: '.ParameterValueType'
          }, {
            n: 'channelSelection',
            en: 'ChannelSelection',
            ti: '.ChannelSelection'
          }, {
            n: 'overlapBehavior',
            en: 'OverlapBehavior',
            ti: '.OverlapBehavior'
          }, {
            n: 'colorMap',
            en: 'ColorMap',
            ti: '.ColorMap'
          }, {
            n: 'contrastEnhancement',
            en: 'ContrastEnhancement',
            ti: '.ContrastEnhancement'
          }, {
            n: 'shadedRelief',
            en: 'ShadedRelief',
            ti: '.ShadedRelief'
          }, {
            n: 'imageOutline',
            en: 'ImageOutline',
            ti: '.ImageOutline'
          }]
      }, {
        ln: 'LATESTONTOP',
        tn: null
      }, {
        ln: 'ChannelSelection',
        tn: null,
        ps: [{
            n: 'redChannel',
            en: 'RedChannel',
            ti: '.SelectedChannelType'
          }, {
            n: 'greenChannel',
            en: 'GreenChannel',
            ti: '.SelectedChannelType'
          }, {
            n: 'blueChannel',
            en: 'BlueChannel',
            ti: '.SelectedChannelType'
          }, {
            n: 'grayChannel',
            en: 'GrayChannel',
            ti: '.SelectedChannelType'
          }]
      }, {
        ln: 'ElseFilter',
        tn: null
      }, {
        ln: 'Graphic',
        tn: null,
        ps: [{
            n: 'externalGraphicOrMark',
            col: true,
            etis: [{
                en: 'ExternalGraphic',
                ti: '.ExternalGraphic'
              }, {
                en: 'Mark',
                ti: '.Mark'
              }],
            t: 'es'
          }, {
            n: 'opacity',
            en: 'Opacity',
            ti: '.ParameterValueType'
          }, {
            n: 'size',
            en: 'Size',
            ti: '.ParameterValueType'
          }, {
            n: 'rotation',
            en: 'Rotation',
            ti: '.ParameterValueType'
          }]
      }, {
        ln: 'Stroke',
        tn: null,
        ps: [{
            n: 'graphicFill',
            en: 'GraphicFill',
            ti: '.GraphicFill'
          }, {
            n: 'graphicStroke',
            en: 'GraphicStroke',
            ti: '.GraphicStroke'
          }, {
            n: 'cssParameter',
            col: true,
            en: 'CssParameter',
            ti: '.CssParameter'
          }]
      }, {
        ln: 'RANDOM',
        tn: null
      }, {
        ln: 'ColorMapEntry',
        tn: null,
        ps: [{
            n: 'color',
            an: {
              lp: 'color'
            },
            t: 'a'
          }, {
            n: 'opacity',
            ti: 'Double',
            an: {
              lp: 'opacity'
            },
            t: 'a'
          }, {
            n: 'quantity',
            ti: 'Double',
            an: {
              lp: 'quantity'
            },
            t: 'a'
          }, {
            n: 'label',
            an: {
              lp: 'label'
            },
            t: 'a'
          }]
      }, {
        ln: 'OnlineResource',
        tn: null,
        ps: [{
            n: 'type',
            ti: 'XLink_1_0.TypeType',
            t: 'a'
          }, {
            n: 'href',
            t: 'a'
          }, {
            n: 'role',
            t: 'a'
          }, {
            n: 'arcrole',
            t: 'a'
          }, {
            n: 'title',
            t: 'a'
          }, {
            n: 'show',
            ti: 'XLink_1_0.ShowType',
            t: 'a'
          }, {
            n: 'actuate',
            ti: 'XLink_1_0.ActuateType',
            t: 'a'
          }]
      }, {
        ln: 'Displacement',
        tn: null,
        ps: [{
            n: 'displacementX',
            en: 'DisplacementX',
            ti: '.ParameterValueType'
          }, {
            n: 'displacementY',
            en: 'DisplacementY',
            ti: '.ParameterValueType'
          }]
      }, {
        ln: 'Font',
        tn: null,
        ps: [{
            n: 'cssParameter',
            col: true,
            en: 'CssParameter',
            ti: '.CssParameter'
          }]
      }, {
        ln: 'GraphicStroke',
        tn: null,
        ps: [{
            n: 'graphic',
            en: 'Graphic',
            ti: '.Graphic'
          }]
      }, {
        ln: 'StyledLayerDescriptor',
        tn: null,
        ps: [{
            n: 'name',
            en: 'Name'
          }, {
            n: 'title',
            en: 'Title'
          }, {
            n: '_abstract',
            en: 'Abstract'
          }, {
            n: 'namedLayerOrUserLayer',
            col: true,
            etis: [{
                en: 'NamedLayer',
                ti: '.NamedLayer'
              }, {
                en: 'UserLayer',
                ti: '.UserLayer'
              }],
            t: 'es'
          }, {
            n: 'version',
            an: {
              lp: 'version'
            },
            t: 'a'
          }]
      }, {
        ln: 'SymbolizerType'
      }, {
        ln: 'GraphicFill',
        tn: null,
        ps: [{
            n: 'graphic',
            en: 'Graphic',
            ti: '.Graphic'
          }]
      }, {
        ln: 'FeatureTypeStyle',
        tn: null,
        ps: [{
            n: 'name',
            en: 'Name'
          }, {
            n: 'title',
            en: 'Title'
          }, {
            n: '_abstract',
            en: 'Abstract'
          }, {
            n: 'featureTypeName',
            en: 'FeatureTypeName'
          }, {
            n: 'semanticTypeIdentifier',
            col: true,
            en: 'SemanticTypeIdentifier'
          }, {
            n: 'rule',
            col: true,
            en: 'Rule',
            ti: '.Rule'
          }]
      }, {
        ln: 'Extent',
        tn: null,
        ps: [{
            n: 'name',
            en: 'Name'
          }, {
            n: 'value',
            en: 'Value'
          }]
      }, {
        ln: 'RemoteOWS',
        tn: null,
        ps: [{
            n: 'service',
            en: 'Service'
          }, {
            n: 'onlineResource',
            en: 'OnlineResource',
            ti: '.OnlineResource'
          }]
      }, {
        ln: 'LegendGraphic',
        tn: null,
        ps: [{
            n: 'graphic',
            en: 'Graphic',
            ti: '.Graphic'
          }]
      }, {
        ln: 'Geometry',
        tn: null,
        ps: [{
            n: 'propertyName',
            en: {
              lp: 'PropertyName',
              ns: 'http:\/\/www.opengis.net\/ogc'
            },
            ti: 'Filter_1_0_0.PropertyNameType'
          }]
      }, {
        ln: 'ImageOutline',
        tn: null,
        ps: [{
            n: 'lineSymbolizer',
            en: 'LineSymbolizer',
            ti: '.LineSymbolizer'
          }, {
            n: 'polygonSymbolizer',
            en: 'PolygonSymbolizer',
            ti: '.PolygonSymbolizer'
          }]
      }, {
        ln: 'OverlapBehavior',
        tn: null,
        ps: [{
            n: 'latestontop',
            en: 'LATEST_ON_TOP',
            ti: '.LATESTONTOP'
          }, {
            n: 'earliestontop',
            en: 'EARLIEST_ON_TOP',
            ti: '.EARLIESTONTOP'
          }, {
            n: 'average',
            en: 'AVERAGE',
            ti: '.AVERAGE'
          }, {
            n: 'random',
            en: 'RANDOM',
            ti: '.RANDOM'
          }]
      }, {
        ln: 'PolygonSymbolizer',
        tn: null,
        bti: '.SymbolizerType',
        ps: [{
            n: 'geometry',
            en: 'Geometry',
            ti: '.Geometry'
          }, {
            n: 'fill',
            en: 'Fill',
            ti: '.Fill'
          }, {
            n: 'stroke',
            en: 'Stroke',
            ti: '.Stroke'
          }]
      }, {
        ln: 'AnchorPoint',
        tn: null,
        ps: [{
            n: 'anchorPointX',
            en: 'AnchorPointX',
            ti: '.ParameterValueType'
          }, {
            n: 'anchorPointY',
            en: 'AnchorPointY',
            ti: '.ParameterValueType'
          }]
      }, {
        ln: 'FeatureTypeConstraint',
        tn: null,
        ps: [{
            n: 'featureTypeName',
            en: 'FeatureTypeName'
          }, {
            n: 'filter',
            en: {
              lp: 'Filter',
              ns: 'http:\/\/www.opengis.net\/ogc'
            },
            ti: 'Filter_1_0_0.FilterType'
          }, {
            n: 'extent',
            col: true,
            en: 'Extent',
            ti: '.Extent'
          }]
      }],
    eis: [{
        en: 'Opacity',
        ti: '.ParameterValueType'
      }, {
        en: 'PointSymbolizer',
        ti: '.PointSymbolizer',
        sh: 'Symbolizer'
      }, {
        en: 'Font',
        ti: '.Font'
      }, {
        en: 'AnchorPointY',
        ti: '.ParameterValueType'
      }, {
        en: 'NamedStyle',
        ti: '.NamedStyle'
      }, {
        en: 'Radius',
        ti: '.ParameterValueType'
      }, {
        en: 'DisplacementY',
        ti: '.ParameterValueType'
      }, {
        en: 'NamedLayer',
        ti: '.NamedLayer'
      }, {
        en: 'LegendGraphic',
        ti: '.LegendGraphic'
      }, {
        en: 'Label',
        ti: '.ParameterValueType'
      }, {
        en: 'ExternalGraphic',
        ti: '.ExternalGraphic'
      }, {
        en: 'Histogram',
        ti: '.Histogram'
      }, {
        en: 'UserStyle',
        ti: '.UserStyle'
      }, {
        en: 'EARLIEST_ON_TOP',
        ti: '.EARLIESTONTOP'
      }, {
        en: 'Normalize',
        ti: '.Normalize'
      }, {
        en: 'MinScaleDenominator',
        ti: 'Double'
      }, {
        en: 'GreenChannel',
        ti: '.SelectedChannelType'
      }, {
        en: 'ImageOutline',
        ti: '.ImageOutline'
      }, {
        en: 'FeatureTypeStyle',
        ti: '.FeatureTypeStyle'
      }, {
        en: 'MaxScaleDenominator',
        ti: 'Double'
      }, {
        en: 'BrightnessOnly',
        ti: 'Boolean'
      }, {
        en: 'BlueChannel',
        ti: '.SelectedChannelType'
      }, {
        en: 'Geometry',
        ti: '.Geometry'
      }, {
        en: 'ChannelSelection',
        ti: '.ChannelSelection'
      }, {
        en: 'Halo',
        ti: '.Halo'
      }, {
        en: 'AnchorPoint',
        ti: '.AnchorPoint'
      }, {
        en: 'DisplacementX',
        ti: '.ParameterValueType'
      }, {
        en: 'ColorMap',
        ti: '.ColorMap'
      }, {
        en: 'FeatureTypeName'
      }, {
        en: 'LATEST_ON_TOP',
        ti: '.LATESTONTOP'
      }, {
        en: 'Service'
      }, {
        en: 'Abstract'
      }, {
        en: 'PolygonSymbolizer',
        ti: '.PolygonSymbolizer',
        sh: 'Symbolizer'
      }, {
        en: 'ShadedRelief',
        ti: '.ShadedRelief'
      }, {
        en: 'ReliefFactor',
        ti: 'Double'
      }, {
        en: 'RedChannel',
        ti: '.SelectedChannelType'
      }, {
        en: 'ColorMapEntry',
        ti: '.ColorMapEntry'
      }, {
        en: 'Format'
      }, {
        en: 'SourceChannelName'
      }, {
        en: 'Name'
      }, {
        en: 'Title'
      }, {
        en: 'Stroke',
        ti: '.Stroke'
      }, {
        en: 'GraphicFill',
        ti: '.GraphicFill'
      }, {
        en: 'WellKnownName'
      }, {
        en: 'Graphic',
        ti: '.Graphic'
      }, {
        en: 'OverlapBehavior',
        ti: '.OverlapBehavior'
      }, {
        en: 'PointPlacement',
        ti: '.PointPlacement'
      }, {
        en: 'ContrastEnhancement',
        ti: '.ContrastEnhancement'
      }, {
        en: 'StyledLayerDescriptor',
        ti: '.StyledLayerDescriptor'
      }, {
        en: 'AVERAGE',
        ti: '.AVERAGE'
      }, {
        en: 'GrayChannel',
        ti: '.SelectedChannelType'
      }, {
        en: 'IsDefault',
        ti: 'Boolean'
      }, {
        en: 'Value'
      }, {
        en: 'OnlineResource',
        ti: '.OnlineResource'
      }, {
        en: 'ElseFilter',
        ti: '.ElseFilter'
      }, {
        en: 'SemanticTypeIdentifier'
      }, {
        en: 'LayerFeatureConstraints',
        ti: '.LayerFeatureConstraints'
      }, {
        en: 'UserLayer',
        ti: '.UserLayer'
      }, {
        en: 'Fill',
        ti: '.Fill'
      }, {
        en: 'LineSymbolizer',
        ti: '.LineSymbolizer',
        sh: 'Symbolizer'
      }, {
        en: 'Rotation',
        ti: '.ParameterValueType'
      }, {
        en: 'RemoteOWS',
        ti: '.RemoteOWS'
      }, {
        en: 'FeatureTypeConstraint',
        ti: '.FeatureTypeConstraint'
      }, {
        en: 'RasterSymbolizer',
        ti: '.RasterSymbolizer',
        sh: 'Symbolizer'
      }, {
        en: 'TextSymbolizer',
        ti: '.TextSymbolizer',
        sh: 'Symbolizer'
      }, {
        en: 'PerpendicularOffset',
        ti: '.ParameterValueType'
      }, {
        en: 'LabelPlacement',
        ti: '.LabelPlacement'
      }, {
        en: 'Extent',
        ti: '.Extent'
      }, {
        en: 'GammaValue',
        ti: 'Double'
      }, {
        en: 'Mark',
        ti: '.Mark'
      }, {
        en: 'Symbolizer',
        ti: '.SymbolizerType'
      }, {
        en: 'Displacement',
        ti: '.Displacement'
      }, {
        en: 'AnchorPointX',
        ti: '.ParameterValueType'
      }, {
        en: 'Size',
        ti: '.ParameterValueType'
      }, {
        en: 'Rule',
        ti: '.Rule'
      }, {
        en: 'GraphicStroke',
        ti: '.GraphicStroke'
      }, {
        en: 'CssParameter',
        ti: '.CssParameter'
      }, {
        en: 'LinePlacement',
        ti: '.LinePlacement'
      }, {
        en: 'RANDOM',
        ti: '.RANDOM'
      }]
  };
  return {
    SLD_1_0_0: SLD_1_0_0
  };
};
if (typeof define === 'function' && define.amd) {
  define([], SLD_1_0_0_Module_Factory);
}
else {
  var SLD_1_0_0_Module = SLD_1_0_0_Module_Factory();
  if (typeof module !== 'undefined' && module.exports) {
    module.exports.SLD_1_0_0 = SLD_1_0_0_Module.SLD_1_0_0;
  }
  else {
    var SLD_1_0_0 = SLD_1_0_0_Module.SLD_1_0_0;
  }
}