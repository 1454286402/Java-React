﻿/**
 *粒子圆
 *
 *@作者乔纳森·尼科尔-@mrjnicol
 *@version 1.0.1
 *@description创建基于画布的粒子系统背景
 *灵感来自：
 * http://requestlab.fr/
 * http://disruptivebydesign.com/
 *
 *@license麻省理工学院许可证（MIT）
 *
 *版权所有（c）2014 Jonathan Nicol-@mrjnicol
 *
 *特此向任何获得副本的人免费授予许可
 *本软件和相关文档文件（“软件”）的
 *在软件中不受限制，包括但不限于权利
 *使用、复制、修改、合并、发布、分发、再许可和/或销售
 *软件的副本，并允许向其提供软件的人员
 *按照以下条件提供：
 *
 *上述版权声明和本许可声明应包含在
 *软件的所有副本或主要部分。
 *
 *本软件按“原样”提供，无任何形式的明示或明示担保
 *默示，包括但不限于适销性保证，
 *适用于特定目的和非侵权。在任何情况下
 *作者或版权持有人应承担任何索赔、损害或其他责任
 *无论是在合同诉讼、侵权诉讼或其他诉讼中，由以下原因引起的责任：，
 *与本软件有关或与本软件的使用或其他交易有关
 *软件。
 */
!function (a) {
    function b(b, d) {
        function e() {
            if (w) {
                $canvas = a('<canvas class="pg-canvas"></canvas>'), v.prepend($canvas), p = $canvas[0], q = p.getContext("2d"), f();
                for (var b = Math.round(p.width * p.height / d.density), c = 0; b > c; c++) {
                    var e = new l;
                    e.setStackPos(c), x.push(e)
                }
                a(window).on("resize", function () {
                    h()
                }), a(document).on("mousemove", function (a) {
                    y = a.pageX, z = a.pageY
                }), B && !A && window.addEventListener("deviceorientation", function () {
                    D = Math.min(Math.max(-event.beta, -30), 30), C = Math.min(Math.max(-event.gamma, -30), 30)
                }, !0), g(), o("onInit")
            }
        }

        function f() {
            p.width = v.width(), p.height = v.height(), q.fillStyle = d.dotColor, q.strokeStyle = d.lineColor, q.lineWidth = d.lineWidth
        }

        function g() {
            if (w) {
                s = a(window).width(), t = a(window).height(), q.clearRect(0, 0, p.width, p.height);
                for (var b = 0; b < x.length; b++) x[b].updatePosition();
                for (var b = 0; b < x.length; b++) x[b].draw();
                E || (r = requestAnimationFrame(g))
            }
        }

        function h() {
            for (f(), i = x.length - 1; i >= 0; i--) (x[i].position.x > v.width() || x[i].position.y > v.height()) && x.splice(i, 1);
            var a = Math.round(p.width * p.height / d.density);
            if (a > x.length) for (; a > x.length;) {
                var b = new l;
                x.push(b)
            } else a < x.length && x.splice(a);
            for (i = x.length - 1; i >= 0; i--) x[i].setStackPos(i)
        }

        function j() {
            E = !0
        }

        function k() {
            E = !1, g()
        }

        function l() {
            switch (this.stackPos, this.active = !0, this.layer = Math.ceil(3 * Math.random()), this.parallaxOffsetX = 0, this.parallaxOffsetY = 0, this.position = {
                x: Math.ceil(Math.random() * p.width),
                y: Math.ceil(Math.random() * p.height)
            }, this.speed = {}, d.directionX) {
                case"left":
                    this.speed.x = +(-d.maxSpeedX + Math.random() * d.maxSpeedX - d.minSpeedX).toFixed(2);
                    break;
                case"right":
                    this.speed.x = +(Math.random() * d.maxSpeedX + d.minSpeedX).toFixed(2);
                    break;
                default:
                    this.speed.x = +(-d.maxSpeedX / 2 + Math.random() * d.maxSpeedX).toFixed(2), this.speed.x += this.speed.x > 0 ? d.minSpeedX : -d.minSpeedX
            }
            switch (d.directionY) {
                case"up":
                    this.speed.y = +(-d.maxSpeedY + Math.random() * d.maxSpeedY - d.minSpeedY).toFixed(2);
                    break;
                case"down":
                    this.speed.y = +(Math.random() * d.maxSpeedY + d.minSpeedY).toFixed(2);
                    break;
                default:
                    this.speed.y = +(-d.maxSpeedY / 2 + Math.random() * d.maxSpeedY).toFixed(2), this.speed.x += this.speed.y > 0 ? d.minSpeedY : -d.minSpeedY
            }
        }

        function m(a, b) {
            return b ? void (d[a] = b) : d[a]
        }

        function n() {
            v.find(".pg-canvas").remove(), o("onDestroy"), v.removeData("plugin_" + c)
        }

        function o(a) {
            void 0 !== d[a] && d[a].call(u)
        }

        var p, q, r, s, t, u = b, v = a(b), w = !!document.createElement("canvas").getContext, x = [], y = 0, z = 0,
            A = !navigator.userAgent.match(/(iPhone|iPod|iPad|Android|BlackBerry|BB10|mobi|tablet|opera mini|nexus 7)/i),
            B = !!window.DeviceOrientationEvent, C = 0, D = 0, E = !1;
        return d = a.extend({}, a.fn[c].defaults, d), l.prototype.draw = function () {
            q.beginPath(), q.arc(this.position.x + this.parallaxOffsetX, this.position.y + this.parallaxOffsetY, d.particleRadius / 2, 0, 2 * Math.PI, !0), q.closePath(), q.fill(), q.beginPath();
            for (var a = x.length - 1; a > this.stackPos; a--) {
                var b = x[a], c = this.position.x - b.position.x, e = this.position.y - b.position.y,
                    f = Math.sqrt(c * c + e * e).toFixed(2);
                f < d.proximity && (q.moveTo(this.position.x + this.parallaxOffsetX, this.position.y + this.parallaxOffsetY), d.curvedLines ? q.quadraticCurveTo(Math.max(b.position.x, b.position.x), Math.min(b.position.y, b.position.y), b.position.x + b.parallaxOffsetX, b.position.y + b.parallaxOffsetY) : q.lineTo(b.position.x + b.parallaxOffsetX, b.position.y + b.parallaxOffsetY))
            }
            q.stroke(), q.closePath()
        }, l.prototype.updatePosition = function () {
            if (d.parallax) {
                if (B && !A) {
                    var a = (s - 0) / 60;
                    pointerX = (C - -30) * a + 0;
                    var b = (t - 0) / 60;
                    pointerY = (D - -30) * b + 0
                } else pointerX = y, pointerY = z;
                this.parallaxTargX = (pointerX - s / 2) / (d.parallaxMultiplier * this.layer), this.parallaxOffsetX += (this.parallaxTargX - this.parallaxOffsetX) / 10, this.parallaxTargY = (pointerY - t / 2) / (d.parallaxMultiplier * this.layer), this.parallaxOffsetY += (this.parallaxTargY - this.parallaxOffsetY) / 10
            }
            switch (d.directionX) {
                case"left":
                    this.position.x + this.speed.x + this.parallaxOffsetX < 0 && (this.position.x = v.width() - this.parallaxOffsetX);
                    break;
                case"right":
                    this.position.x + this.speed.x + this.parallaxOffsetX > v.width() && (this.position.x = 0 - this.parallaxOffsetX);
                    break;
                default:
                    (this.position.x + this.speed.x + this.parallaxOffsetX > v.width() || this.position.x + this.speed.x + this.parallaxOffsetX < 0) && (this.speed.x = -this.speed.x)
            }
            switch (d.directionY) {
                case"up":
                    this.position.y + this.speed.y + this.parallaxOffsetY < 0 && (this.position.y = v.height() - this.parallaxOffsetY);
                    break;
                case"down":
                    this.position.y + this.speed.y + this.parallaxOffsetY > v.height() && (this.position.y = 0 - this.parallaxOffsetY);
                    break;
                default:
                    (this.position.y + this.speed.y + this.parallaxOffsetY > v.height() || this.position.y + this.speed.y + this.parallaxOffsetY < 0) && (this.speed.y = -this.speed.y)
            }
            this.position.x += this.speed.x, this.position.y += this.speed.y
        }, l.prototype.setStackPos = function (a) {
            this.stackPos = a
        }, e(), {option: m, destroy: n, start: k, pause: j}
    }

    var c = "particleground";
    a.fn[c] = function (d) {
        if ("string" == typeof arguments[0]) {
            var e, f = arguments[0], g = Array.prototype.slice.call(arguments, 1);
            return this.each(function () {
                a.data(this, "plugin_" + c) && "function" == typeof a.data(this, "plugin_" + c)[f] && (e = a.data(this, "plugin_" + c)[f].apply(this, g))
            }), void 0 !== e ? e : this
        }
        return "object" != typeof d && d ? void 0 : this.each(function () {
            a.data(this, "plugin_" + c) || a.data(this, "plugin_" + c, new b(this, d))
        })
    }, a.fn[c].defaults = {
        minSpeedX: .1,
        maxSpeedX: .7,
        minSpeedY: .1,
        maxSpeedY: .7,
        directionX: "center",
        directionY: "center",
        density: 1e4,
        dotColor: "#666666",
        lineColor: "#666666",
        particleRadius: 7,
        lineWidth: 1,
        curvedLines: !1,
        proximity: 100,
        parallax: !0,
        parallaxMultiplier: 5,
        onInit: function () {
        },
        onDestroy: function () {
        }
    }
}(jQuery),/**
 * requestAnimationFrame polyfill by Erik M???ller. fixes from Paul Irish and Tino Zijdel
 * @see: http://paulirish.com/2011/requestanimationframe-for-smart-animating/
 * @see: http://my.opera.com/emoller/blog/2011/12/20/requestanimationframe-for-smart-er-animating
 * @license: MIT license
 */
    function () {
        for (var a = 0, b = ["ms", "moz", "webkit", "o"], c = 0; c < b.length && !window.requestAnimationFrame; ++c) window.requestAnimationFrame = window[b[c] + "RequestAnimationFrame"], window.cancelAnimationFrame = window[b[c] + "CancelAnimationFrame"] || window[b[c] + "CancelRequestAnimationFrame"];
        window.requestAnimationFrame || (window.requestAnimationFrame = function (b) {
            var c = (new Date).getTime(), d = Math.max(0, 16 - (c - a)), e = window.setTimeout(function () {
                b(c + d)
            }, d);
            return a = c + d, e
        }), window.cancelAnimationFrame || (window.cancelAnimationFrame = function (a) {
            clearTimeout(a)
        })
    }();